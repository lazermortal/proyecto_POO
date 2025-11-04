package carrito;

import producto.Producto;

import java.util.ArrayList;

public class LineaCarrito {
    private int cantidad;
    private int subtotal;
    private final Carrito carrito;
    private Producto productos;

    public LineaCarrito(int cantidad, int subtotal, Carrito carrito, Producto productos) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.carrito = carrito;
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }
}
