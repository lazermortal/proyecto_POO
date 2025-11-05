package compra;

import carrito.Carrito;
import carrito.LineaCarrito;
import producto.Producto;
import usuario.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra {
    private String id;
    private String fecha;
    private int total;
    private estadoCompra estado;
    private Cliente cliente;
    private ArrayList<LineaCompra> lineaCompras = new  ArrayList<>();


    public Compra(String id,Cliente cliente) {
        this.id = id;
        this.fecha = LocalDate.now().toString();
        this.estado = estadoCompra.PENDIENTE;
        this.cliente = cliente;
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

    public ArrayList<LineaCompra> getLineaCompras() {
        return lineaCompras;
    }

    public void setLineaCompras(ArrayList<LineaCompra> lineaCompras) {
        this.lineaCompras = lineaCompras;
    }

    public void crearLineaCompra(String direccion, Carrito carrito) {
        for(int i = 0; i <carrito.getLineaCarritos().size(); i++ ) {
            LineaCompra lineaCompra = new LineaCompra(carrito.getLineaCarritos().get(i).getCantidad(), direccion,this,carrito.getLineaCarritos().get(i).getProductos());
            this.total += (lineaCompra.getSubtotal());
            this.lineaCompras.add(lineaCompra);
        }
    }

}
