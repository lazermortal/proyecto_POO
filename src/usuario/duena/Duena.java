package usuario.duena;

import usuario.Usuario;

public class Duena extends Usuario {

    private String claveMaestra;
    private String fechaCoronacion;
    private RegistroEsclavos registroEsclavos;

    public Duena(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
    }

    public Duena(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String claveMaestra, String fechaCoronacion) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.claveMaestra = claveMaestra;
        this.fechaCoronacion = fechaCoronacion;
    }

    public void administrarRegistroEsclavos(){
        System.out.println("Hola querida dueña, que deseas modificar?");
    }

    public String getFechaCoronacion() {
        return fechaCoronacion;
    }

    public void setFechaCoronacion(String fechaCoronacion) {
        this.fechaCoronacion = fechaCoronacion;
    }

    public String getClaveMaestra() {
        return claveMaestra;
    }

    public void setClaveMaestra(String claveMaestra) {
        this.claveMaestra = claveMaestra;
    }

    public RegistroEsclavos getRegistroEsclavos() {
        return registroEsclavos;
    }

    public void setRegistroEsclavos(RegistroEsclavos registroEsclavos) {
        this.registroEsclavos = registroEsclavos;
    }
}
