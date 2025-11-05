package fabrica;

import java.util.ArrayList;

public class Fabrica {
    private Integer id;
    private String pais;
    private String ciudad;
    private String capacidad;
    private String nivelAutomatizacion;
    private ArrayList<TrabajadorEsclavizado> Trabajadores = new ArrayList<>();

    public Fabrica(Integer id, String pais, String ciudad, String capacidad, String nivelAutomatizacion) {
        this.id = id;
        this.pais = pais;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.nivelAutomatizacion = nivelAutomatizacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNivelAutomatizacion() {
        return nivelAutomatizacion;
    }

    public void setNivelAutomatizacion(String nivelAutomatizacion) {
        this.nivelAutomatizacion = nivelAutomatizacion;
    }
}
