package compra;

import usuario.Cliente;

import java.util.ArrayList;

public class Carrito {
    private String id;
    private String fechaCreacion;
    private Cliente cliente;

    public Carrito(String id, String fechaCreacion, Cliente cliente) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClientes(Cliente cliente) {
        this.cliente = cliente;
    }

}
