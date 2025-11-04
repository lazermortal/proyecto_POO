package compra;

import producto.Producto;

public class LineaCompra {
private int cantidad;
private int subtotal;
private int precioUnitario;
private String direccionEntrega;
private Compra compra;
private Producto producto;

    public LineaCompra(int cantidad, String direccionEntrega, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.direccionEntrega = direccionEntrega;
        this.compra = compra;
        this.producto = producto;
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

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void agregarProducto(Producto producto,int cantidad) {
        if(this.producto == null) {
            this.producto = producto;
        }else if(this.producto==producto) {
            this.cantidad+=cantidad;
        }{
            System.out.println("ya hay un producto diferente al que se intenta agregar");
        }
    }
}
