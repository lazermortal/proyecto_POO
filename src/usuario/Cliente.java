package usuario;

import compra.Carrito;

import java.util.ArrayList;

public class Cliente extends Usuario {

    private String direccion;
    private int telefono;
    private ArrayList<Carrito> carritos = new ArrayList<>();

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

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }
}
