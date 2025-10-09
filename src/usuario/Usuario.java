package usuario;

public abstract class Usuario {
private Long id;
private String nombre;
private String rol;
private String email;
private String fechaRegistro;
private String estadoCuenta;

    public Usuario(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.estadoCuenta = estadoCuenta;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
}
