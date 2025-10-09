package usuario;

public class Cliente extends Usuario {

    private String direccion;
    private int telefono;

    public Cliente(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
    }

    public Cliente(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String direccion, int telefono) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.direccion = direccion;
        this.telefono = telefono;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
