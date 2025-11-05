package usuario.consejoSombrio;

import consejoSombrio.ConsejoSombrio;
import usuario.Usuario;

import java.util.ArrayList;

public class AdministradorContenido extends Usuario {
    private String permisiosEdicion;
    private ArrayList<ConsejoSombrio> ConsejosSombrios = new ArrayList<>();

    public AdministradorContenido(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);

    }

    public AdministradorContenido(Long id, String nombre, String rol, String email, String fechaRegistro, String estadoCuenta, String permisiosEdicion) {
        super(id, nombre, rol, email, fechaRegistro, estadoCuenta);
        this.permisiosEdicion = permisiosEdicion;
    }

    public String getPermisiosEdicion() {
        return permisiosEdicion;
    }

    public void setPermisiosEdicion(String permisiosEdicion) {
        this.permisiosEdicion = permisiosEdicion;
    }

    public void CRUD() {

    }
}
