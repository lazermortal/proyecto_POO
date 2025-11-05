package consejoSombrio;

import usuario.consejoSombrio.AdministradorContenido;
import usuario.consejoSombrio.AdministradorUsuario;

import java.util.ArrayList;

public class ConsejoSombrio {
    private Integer id;
    private String nombreClave;
    private ArrayList<AdministradorUsuario> AdministradoresUsuarios = new ArrayList<>();
    private ArrayList<AdministradorContenido> AdministradoresContenidos = new ArrayList<>();

    public ConsejoSombrio(Integer id, String nombreClave) {
        this.id = id;
        this.nombreClave = nombreClave;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }
}
