package producto;

import usuario.Usuario;

import java.util.ArrayList;

public class DesarrolladorProducto extends Usuario {
    private String especialidad;
    private ArrayList<Producto> productos = new ArrayList<>();

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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Producto crearProducto(Long id, String nombre, String descripcion, int precio, int stock, String fechaLanzamiento) {
        Producto nuevoProducto = new Producto( id,  nombre,  descripcion,  precio,  stock, fechaLanzamiento);

        this.agregarProducto(nuevoProducto);
        nuevoProducto.agregarDesarrollador(this);
        return nuevoProducto;
    }

  public void agregarProducto(Producto producto) {
        for(int i=0;i<productos.size();i++) {
            if (this.productos.get(i).getNombre().equals(producto.getNombre())) {
                System.out.println(producto.getNombre() + " ya fue creado por este desarrollador");
                return;
            }
        }
      productos.add(producto);
  }
  public void removerProducto(Producto producto) {
        if (this.productos.contains(producto)) {
            this.productos.remove(producto);
            producto.removerDesarrollador(this);

        }
  }

}
