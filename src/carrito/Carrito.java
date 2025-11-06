package carrito;

import producto.Producto;
import usuario.Cliente;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrito {
    private int id = 0;
    private LocalDate fechaCreacion=LocalDate.now();
    private Cliente cliente;
    private ArrayList<LineaCarrito> lineaCarritos = new ArrayList<>();

    public Carrito(Cliente cliente) {
        id = id++;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
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
    }
    public void vaciarCarrito() {
        lineaCarritos.clear();
    }
}
