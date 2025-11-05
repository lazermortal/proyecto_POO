package compra;

import usuario.Cliente;

public class MetodoDePago {
    private Long id;
    private String tipo;
    private String titular;
    private int numeroEnmascarado;
    private Cliente cliente;

    public MetodoDePago(Long id, String tipo, String titular, int numeroEnmascarado, Cliente cliente) {
        this.id = id;
        this.tipo = tipo;
        this.titular = titular;
        this.numeroEnmascarado = numeroEnmascarado;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroEnmascarado() {
        return numeroEnmascarado;
    }

    public void setNumeroEnmascarado(int numeroEnmascarado) {
        this.numeroEnmascarado = numeroEnmascarado;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
