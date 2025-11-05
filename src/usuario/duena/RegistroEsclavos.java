package usuario.duena;

import fabrica.TrabajadorEsclavizado;
import usuario.consejoSombrio.AdministradorUsuario;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RegistroEsclavos {
    private LocalDateTime ultimoAcceso;
    private  String nivelCifrado;
    private Duena duena;
    private ArrayList<TrabajadorEsclavizado> Trabajadores = new ArrayList<>();

    public RegistroEsclavos(LocalDateTime ultimoAcceso, String nivelCifrado, Duena duena) {
        this.ultimoAcceso = ultimoAcceso;
        this.nivelCifrado = nivelCifrado;
        this.duena = duena;
    }

    protected LocalDateTime getUltimoAcceso() {
        return ultimoAcceso;
    }

    protected void setUltimoAcceso(LocalDateTime ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    protected String getNivelCifrado() {
        return nivelCifrado;
    }

    protected void setNivelCifrado(String nivelCifrado) {
        this.nivelCifrado = nivelCifrado;
    }

    public Duena getDuena() {
        return duena;
    }

    public void setDuena(Duena duena) {
        this.duena = duena;
    }
}
