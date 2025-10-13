package compra;

public class Compra {
    private String id;
    private String fecha;
    private int total;
private estadoCompra estado;


    public Compra(String id, String fecha, int total, estadoCompra estado) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public estadoCompra getEstado() {
        return estado;
    }

    public void setEstado(estadoCompra estado) {
        this.estado = estado;
    }
}
