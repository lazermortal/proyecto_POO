package usuario;

import carrito.Carrito;
import compra.Compra;
import compra.LineaCompra;
import producto.Producto;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private String direccion;
    private int telefono;
    private ArrayList<Carrito> carritos = new ArrayList<>();
    private ArrayList<Compra> compras = new ArrayList<>();

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
    public Producto buscarProducto(String nombre) {
        for(int i=0;i<carritos.size();i++){
            for(int j=0;j<carritos.get(i).getLineaCarritos().size();j++){
                if(carritos.get(i).getLineaCarritos().get(j).getProductos().getNombre().toLowerCase().equals(nombre)){
                    return carritos.get(i).getLineaCarritos().get(j).getProductos();
                }
            }
        }
        return null;
    }
    public void añadirNuevoProductoCompra(Producto producto, int cantidad, String direccionEntrega,Compra compra) {
        compra.crearLineaCompra(producto,cantidad,direccionEntrega,compra);
    }
    public void crearCompra(String id, String fecha, Cliente cliente){
        Compra compra = new Compra(id,fecha);

    }
    public void agregarCompra(Compra compra){
        if(!this.compras.contains(compra)){
            compras.add(compra);
        }{
            System.out.println("este cliente ya tiene esta compra agregada");
        }
    }
    public void removerCompra(Compra compra){
        compras.remove(compra);
    }


    public void agregarProductoCompra(Compra compra,LineaCompra lineaCompra, Producto producto,int cantidad) {
        compra.agregarProductoCompra(lineaCompra,producto,cantidad);
    }
}
