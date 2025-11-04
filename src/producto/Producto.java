package producto;

import carrito.LineaCarrito;
import compra.LineaCompra;

import java.util.ArrayList;

public class Producto {
    private Long id;
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;
    private String fechaLanzamiento;
    private ArrayList<LineaCarrito> lineaCarritos;
    private ArrayList<LineaCompra> lineaCompras;
    private Categoria categoria;
    private ArrayList<DesarrolladorProducto> desarrolladorProductos;

    public Producto(Long id, String nombre, String descripcion, int precio, int stock, String fechaLanzamiento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.fechaLanzamiento = fechaLanzamiento;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public ArrayList<LineaCarrito> getLineaCarritos() {
        return lineaCarritos;
    }

    public void setLineaCarritos(ArrayList<LineaCarrito> lineaCarritos) {
        this.lineaCarritos = lineaCarritos;
    }

    public ArrayList<LineaCompra> getLineaCompras() {
        return lineaCompras;
    }

    public void setLineaCompras(ArrayList<LineaCompra> lineaCompras) {
        this.lineaCompras = lineaCompras;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<DesarrolladorProducto> getDesarrolladorProductos() {
        return desarrolladorProductos;
    }

    public void setDesarrolladorProductos(ArrayList<DesarrolladorProducto> desarrolladorProductos) {
        this.desarrolladorProductos = desarrolladorProductos;
    }

    public void agregarDesarrollador(DesarrolladorProducto desarrollador) {
        if (!this.desarrolladorProductos.contains(desarrollador)) {
            this.desarrolladorProductos.add(desarrollador);
            desarrollador.agregarProducto(this);
        }{
            System.out.println("este desarrollador ya esta listado como creador del producto");
        }
    }

    public void removerDesarrollador(DesarrolladorProducto desarrollador) {
        if (this.desarrolladorProductos.contains(desarrollador)) {
            this.desarrolladorProductos.remove(desarrollador);
            desarrollador.removerProducto(this);
        }
    }
}
