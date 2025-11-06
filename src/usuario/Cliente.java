package usuario;

import carrito.Carrito;
import carrito.LineaCarrito;
import compra.Compra;
import compra.LineaCompra;
import compra.MetodoDePago;
import producto.Producto;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente extends Usuario {
   private Scanner sc = new Scanner(System.in);

    private String direccion;
    private int telefono;
    private ArrayList<Carrito> carritos = new ArrayList<>();
    private ArrayList<Compra> compras = new ArrayList<>();
    private ArrayList<MetodoDePago> metodosDePago = new ArrayList<>();

    public Cliente(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
    }

    public Cliente(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String direccion, int telefono) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String direccion, int telefono, ArrayList<Carrito> carritos, ArrayList<Compra> compras) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.direccion = direccion;
        this.telefono = telefono;
        this.carritos = carritos;
        this.compras = compras;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }

    public ArrayList<MetodoDePago> getMetodosDePago() {
        return metodosDePago;
    }

    public void setMetodosDePago(ArrayList<MetodoDePago> metodosDePago) {
        this.metodosDePago = metodosDePago;
    }

    public void añadirInfo(String direccion, int telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //compra

    public Compra crearCompra(String direccion,Carrito carrito){
        Compra compra = new Compra(carrito.getId(),this);
        this.compras.add(compra);

        compra.crearLineaCompra(direccion,carrito);
        return compra;
    }
    public void agregarCompra(Compra compra){
        if(!this.compras.contains(compra)){
            compras.add(compra);
        }else{
            System.out.println("este cliente ya tiene esta compra agregada");
        }
    }
    public void removerCompra(Compra compra){
        compras.remove(compra);
    }
    //carrito,lineacarrito y producto

    public void buscarProductoCarrito(String nombre) {
        for(int i=0;i<carritos.size();i++){
            for(int j=0;j<carritos.get(i).getLineaCarritos().size();j++){
                if(carritos.get(i).getLineaCarritos().get(j).getProductos().getNombre().equalsIgnoreCase(nombre)){
                    System.out.println(nombre + " esta en el carrito del cliente");
                    return;
                }
            }
        }
        System.out.println("el producto "+nombre+" no esta en el carrito del cliente");
    }
    public void añadirNuevoProductoCarrito(Producto producto, int cantidad,Carrito carrito) {
        carrito.agregarProductoCarrito(producto,cantidad);
    }

    public void aumentarCantidadProducto(Carrito carrito,LineaCarrito lineaCarrito,Producto producto, int cantidad) {
        carrito.aumentarCantidadProducto(lineaCarrito,producto,cantidad);
    }
    public void eliminarProductoCarrito(Carrito carrito, LineaCarrito lineaCarrito) {
    carrito.eliminarLineaCarrito(lineaCarrito);
    }
    public Carrito crearCarrito(long id){
        Carrito carrito = new Carrito(id,this);
        carritos.add(carrito);
        return carrito;
    }
    public void vaciarCarrito(Carrito carrito){
        carrito.vaciarCarrito();
    }
    //metodo de pago
    public MetodoDePago crearMetodoDePago(Long id, String tipo, String titular, int numeroEnmascarado){
        boolean count=true;
        for(int i=0;i<metodosDePago.size();i++){
            if(metodosDePago.get(i).getId().equals(id)){
                System.out.println("este tipo de metodo de pago ya fue añadido");
                count=false;
            }
        }
        if(count){
            MetodoDePago metodoDePago1 =new MetodoDePago(id,tipo,titular,numeroEnmascarado,this);
            metodosDePago.add(metodoDePago1);
            return metodoDePago1;
        }
 return null;
    }
    public void eliminarMetodoDePago(MetodoDePago metodoDePago){
        metodosDePago.remove(metodoDePago);
        metodoDePago=null;
    }

    public void menuCliente(ArrayList<Producto> lista) {

        System.out.println("Bienvenido cliente, como se encuentra?");
        System.out.println("escoja un numero para acceder a la accion");
        boolean salir = false;
        while (!salir) {
            boolean productP = false;
            LineaCarrito lineaCarrito = null;
            Producto p = null;
            System.out.println("presione: \n1) para agregar un producto al carito\n2) para crear un carrito");
            System.out.println("3) eliminar un producto del carito\n4) aumentar un producto del carrito\n5) buscar producto en el carrito");
            System.out.println("6) vaciar carrito\n7) crear metodo de pago\n8) eliminar metodo de pago\n9)crear compra o cualquier otro numero para salir del menu");
            int base = Integer.parseInt(sc.nextLine());
            switch (base) {
                case 1:

                    System.out.println("elija el producto a agregar al carrito");
                    String nombre = sc.nextLine();
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                            p = lista.get(i);
                            productP = true;
                        }
                    }
                    if (!productP) {
                        System.out.println("este producto no existe");
                        return;
                    }
                    System.out.println("ingrese la cantidad del producto que desea agregar");
                    int cantidad = Integer.parseInt(sc.nextLine());
                    System.out.println("elije el carrito al que añadiras el producto");
                    Long idCarrito = Long.parseLong(sc.nextLine());
                   Carrito carrito1 = this.buscarCarrito(idCarrito);
                   if(carrito1!=null) {
                       this.añadirNuevoProductoCarrito(p, cantidad, carrito1);
                   }
                    break;

                case 2:
                    System.out.println("ingrese la id deseada al carrito");
                    Long id = Long.parseLong(sc.nextLine());
                    Carrito carro = this.crearCarrito(id);
                    break;
                case 3:
                    System.out.println("elija el carrito de onde desea eliminar el producto");
                    Long idcarrito = Long.parseLong(sc.nextLine());
                    Carrito carrito0 =this.buscarCarrito(idcarrito);
                    if(carrito0!=null) {
                        System.out.println("elija el noombre del producto que desea eliminar");
                    String nombreProducto = sc.nextLine();
                        LineaCarrito lineaCarrito1 = this.buscarLineaCarrito(nombreProducto,carrito0);
                        if(lineaCarrito1!=null) {
                            this.eliminarProductoCarrito(carrito0, lineaCarrito);
                        }
                        }
                        break;
                case 4:
                    System.out.println("introduzca el id del carrito donde aumentara la cantidad de producto");
                    Long idc=Long.parseLong(sc.nextLine());
                    Carrito carrito2 = this.buscarCarrito(idc);
                    if(carrito2!=null) {
                        System.out.println("digite el nombre del producto a aumentar");
                        String nombreProducto0 = sc.nextLine();
                        LineaCarrito lineaCarrito2 = this.buscarLineaCarrito(nombreProducto0,carrito2);
                        if(lineaCarrito2!=null) {
                            System.out.println("ingrese la cantidad a aumnetar");
                            int cantidada = Integer.parseInt(sc.nextLine());
                            this.aumentarCantidadProducto(carrito2,lineaCarrito2,lineaCarrito2.getProductos(),cantidada);
                        }
                    }
                    break;
                case 5:
                    System.out.println("ingresa el nombre del producto que desea buscar en el carrito");
                    String nombrePr = sc.nextLine();
                    this.buscarProductoCarrito(nombrePr);
                    break;
                case 6:
                    System.out.println("ingrese la id del carrito que desea vaciar");
                    Long idca=Long.parseLong(sc.nextLine());
                    Carrito carrito3 = this.buscarCarrito(idca);
                    if(carrito3!=null) {
                        this.vaciarCarrito(carrito3);
                    }
                    break;
                case 7:
                    System.out.println("ingrese el id del metodo de pago");
                    Long idpago = Long.parseLong(sc.nextLine());
                    System.out.println("ingrese el tipo de metodo de pago");
                    String tipoPago = sc.nextLine();
                    System.out.println("ingrese el titular del metodo de pago");
                    String titularPago = sc.nextLine();
                    System.out.println("ingrese el numero registrado en el metodo de pago");
                    int numeroRegistro =Integer.parseInt(sc.nextLine());
                    this.crearMetodoDePago(idpago,tipoPago,titularPago,numeroRegistro);
                    break;
                case 8:
                    System.out.println("ingrese el id del metodo de pago a remover");
                    Long idpagoa = Long.parseLong(sc.nextLine());
                    for(int i=0;i<this.getMetodosDePago().size();i++) {
                        if(this.getMetodosDePago().get(i).getId().equals(idpagoa)) {
                            this.eliminarMetodoDePago(this.getMetodosDePago().get(i));
                            return;
                        }
                    }
                    System.out.println("este metodo de pago que desea eliminar no existe");
                    break;
                    case 9:
                        System.out.println("ingrese su direccion");
                        String direccion0 = sc.nextLine();
                        System.out.println("ingrese el id del carrito que desea comprar");
                        Long idcarrito9 = Long.parseLong(sc.nextLine());
                        Carrito car=this.buscarCarrito(idcarrito9);
                        if(car!=null) {
                            this.crearCompra(direccion0,car);
                        }
                        break;
                default:
                    System.out.println("se cierra el menu");
                    salir=true;
                    break;
            }
        }
    }
    public Carrito buscarCarrito(Long id){
        Carrito carrito = null;
        for (int i = 0; i < carritos.size(); i++) {
            if (carritos.get(i).getId().equals(id)) {
                return carrito = carritos.get(i);
            }
        }
        System.out.println("este carrito no existe");
        return null;
        }
    public LineaCarrito buscarLineaCarrito(String x,Carrito carrito) {
        LineaCarrito lineaCarrito = null;
        System.out.println("escoja el nombre del producto que desea eliminar");
        String nombreProducto = sc.nextLine();
        for (int i = 0; i < (carrito.getLineaCarritos().size()); i++) {
            if (carrito.getLineaCarritos().get(i).getProductos().getNombre().equalsIgnoreCase(nombreProducto)) {
                return lineaCarrito = carrito.getLineaCarritos().get(i);
            }
        }
        return null;
    }



































    private Producto buscarProducto(String nombre, ArrayList<Producto> lista) {
        for (Producto p : lista) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
