package compra;

import carrito.LineaCarrito;
import producto.Producto;
import usuario.Cliente;

import java.util.ArrayList;

public class Compra {
    private String id;
    private String fecha;
    private int total;
    private estadoCompra estado;
    private Cliente cliente;
    private ArrayList<LineaCompra> lineaCompras = new  ArrayList<>();


    public Compra(String id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estadoCompra.PENDIENTE;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public estadoCompra getEstado() {
        return estado;
    }

    public void setEstado(estadoCompra estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void crearLineaCompra(Producto producto, int cantidad, String direccionEntrega,Compra compra) {
        LineaCompra lineaCompra = new LineaCompra(cantidad,direccionEntrega,compra,producto);
        lineaCompras.add(lineaCompra);
    }
    public void agregarProductoCompra(LineaCompra lineaCompra,Producto producto,int cantidad) {
        lineaCompra.agregarProducto(producto,cantidad);
    }
}
