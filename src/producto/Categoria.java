package producto;

import java.util.ArrayList;

public class Categoria {
private Long id;
private String nombre;
private String descripcion;
private ArrayList<Producto> productos;
private ArrayList<DesarrolladorProducto> desarrolladorProductos;

    public Categoria(Long id, String nombre, String descripcion, ArrayList<DesarrolladorProducto> desarrolladorProductos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.desarrolladorProductos = desarrolladorProductos;
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<DesarrolladorProducto> getDesarrolladorProductos() {
        return desarrolladorProductos;
    }

    public void setDesarrolladorProductos(ArrayList<DesarrolladorProducto> desarrolladorProductos) {
        this.desarrolladorProductos = desarrolladorProductos;
    }
}
