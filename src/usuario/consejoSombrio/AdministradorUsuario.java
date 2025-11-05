package usuario.consejoSombrio;

import consejoSombrio.ConsejoSombrio;
import usuario.Usuario;

import java.util.ArrayList;

public class AdministradorUsuario extends Usuario {
    private String nivelAcceso;
    private ArrayList<ConsejoSombrio> ConsejosSombrios = new ArrayList<>();

    public AdministradorUsuario(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String nivelAcceso) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.nivelAcceso = nivelAcceso;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public void suspenderUsuario() {

    }

    public void ReactivarUsuario() {

    }
}
