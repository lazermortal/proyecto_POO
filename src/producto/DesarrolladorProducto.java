package producto;

import usuario.Usuario;

import java.util.ArrayList;

public class DesarrolladorProducto extends Usuario {
    private String especialidad;
    private ArrayList<Producto> productos;

    public DesarrolladorProducto(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String especialidad) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void crearProducto(Long id, String nombre, String descripcion, int precio, int stock, String fechaLanzamiento,Producto producto) {
        Producto nuevoProducto = new Producto( id,  nombre,  descripcion,  precio,  stock, fechaLanzamiento);

        this.agregarProducto(nuevoProducto);
        nuevoProducto.agregarDesarrollador(this);
    }

  public void agregarProducto(Producto producto) {
        if (!this.productos.contains(producto)) {
            productos.add(producto);
        }{
          System.out.println("este desarrollador ya creo ese producto");
      }

  }
  public void removerProducto(Producto producto) {
        productos.remove(producto);
  }

}
