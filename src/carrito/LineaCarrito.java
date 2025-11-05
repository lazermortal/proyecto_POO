package carrito;

import producto.Producto;

import java.util.ArrayList;

public class LineaCarrito {
    private int cantidad;
    private int subtotal;
    private Carrito carrito;
    private Producto producto;

    public LineaCarrito(int cantidad, Carrito carrito, Producto productos) {
        this.cantidad = cantidad;
        this.carrito = carrito;
        this.producto = productos;
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
    public void setCarrito(Carrito carrito) {
        this.carrito=carrito;
    }

    public Producto getProductos() {
        return producto;
    }

    public void setProductos(Producto producto) {
        this.producto = producto;
    }


    public void aumentarProducto(Producto producto,int cantidad) {
        if(this.producto == null) {
            this.producto = producto;
        }else if(this.producto.equals(producto)) {
            this.cantidad+=cantidad;
        }else {
            System.out.println("ya hay un producto diferente al que se intenta agregar");
        }
    }

}
