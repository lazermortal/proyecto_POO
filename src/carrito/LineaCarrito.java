package carrito;

public class LineaCarrito {
    private int cantidad;
    private int subtotal;
    private final Carrito carrito;

    public LineaCarrito(int cantidad, int subtotal, Carrito carrito) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.carrito = carrito;
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

}
