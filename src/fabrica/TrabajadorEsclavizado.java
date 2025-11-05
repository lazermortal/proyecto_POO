package fabrica;

import usuario.duena.RegistroEsclavos;

import java.util.ArrayList;

public class TrabajadorEsclavizado {
    private Integer id;
    private String nombre;
    private String paisOrigen;
    private Integer edad;
    private String fechaCaptura;
    private String salud;
    private String asignadoA;
    private Fabrica fabrica;
    private RegistroEsclavos registroEsclavos;

    public TrabajadorEsclavizado(Integer id, String nombre, String paisOrigen, Integer edad, String fechaCaptura, String salud, String asignadoA, Fabrica fabrica, RegistroEsclavos registroEsclavos) {
        this.id = id;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.edad = edad;
        this.fechaCaptura = fechaCaptura;
        this.salud = salud;
        this.asignadoA = asignadoA;
        this.fabrica = fabrica;
        this.registroEsclavos = registroEsclavos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(String fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getAsignadoA() {
        return asignadoA;
    }

    public void setAsignadoA(String asignadoA) {
        this.asignadoA = asignadoA;
    }

    public void laburar(){
        System.out.println("Trabajo como rata");
    }
}
