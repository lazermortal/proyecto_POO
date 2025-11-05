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
    private ArrayList<LineaCarrito> lineaCarritos = new ArrayList<>();
    private ArrayList<LineaCompra> lineaCompras = new ArrayList<>();
    private Categoria categoria;
    private ArrayList<DesarrolladorProducto> desarrolladorProductos = new ArrayList<>();

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

            for(int i=0;i<desarrolladorProductos.size();i++) {
                if (this.desarrolladorProductos.get(i).getNombre().equals(desarrollador.getNombre())) {
                    System.out.println(desarrollador.getNombre() + " ya fue creado por este desarrollador");
                    return;
                }
            }
            desarrolladorProductos.add(desarrollador);
    }

    public void removerDesarrollador(DesarrolladorProducto desarrollador) {
        if (this.desarrolladorProductos.contains(desarrollador)) {
            this.desarrolladorProductos.remove(desarrollador);
        }
    }
}
