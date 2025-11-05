package usuario;

import carrito.Carrito;
import carrito.LineaCarrito;
import compra.Compra;
import compra.LineaCompra;
import compra.MetodoDePago;
import producto.Producto;

import java.util.ArrayList;

public class Cliente extends Usuario {

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

    public void añadirInfo(String direccion, int telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //compra

    public Compra crearCompra(String direccion,String id,Carrito carrito, Cliente cliente){
        Compra compra = new Compra(id,this);
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

    public void buscarProducto(String nombre) {
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
    public void añadirNuevoProductoCarrito(Producto producto, int cantidad, String direccionEntrega,Carrito carrito) {
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

}
