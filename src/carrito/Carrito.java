package carrito;

import producto.Producto;
import usuario.Cliente;

import java.util.ArrayList;

public class Carrito {
    private Long id;
    private String fechaCreacion;
    private Cliente cliente;
    private ArrayList<LineaCarrito> lineaCarritos = new ArrayList<>();

    public Carrito(Long id, String fechaCreacion, Cliente cliente) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClientes(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaCarrito> getLineaCarritos() {
        return lineaCarritos;
    }

    public void setLineaCarritos(ArrayList<LineaCarrito> lineaCarritos) {
        this.lineaCarritos = lineaCarritos;
    }

    public void agregarProductoCarrito(Producto producto, int cantidad) {
        for(int i=0;i<lineaCarritos.size();i++) {
            if (lineaCarritos.get(i).getProductos().getNombre().equalsIgnoreCase(producto.getNombre())) {
                System.out.println("ya hay un producto con este nombre agregado al carrito");
                return;
            }
        }
        LineaCarrito nuevaLineaCarrito = new LineaCarrito(cantidad, this, producto);
        this.lineaCarritos.add(nuevaLineaCarrito);
    }
    public void aumentarCantidadProducto(LineaCarrito lineaCarrito, Producto producto, int cantidad) {
        lineaCarrito.aumentarProducto(producto,cantidad);
    }
    public void eliminarLineaCarrito(LineaCarrito lineaCarrito) {
        lineaCarritos.remove(lineaCarrito);
        lineaCarrito=null;
        lineaCarrito.setCarrito(null);
    }
}
