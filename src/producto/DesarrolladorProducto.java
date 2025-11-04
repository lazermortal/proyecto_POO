package producto;

import usuario.Usuario;

public class DesarrolladorProducto extends Usuario {
    private String especialidad;

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
}
