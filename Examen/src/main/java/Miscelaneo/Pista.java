package Miscelaneo;

public class Pista {

    private int id;
    private String nombre;
    private double precio;
    private String tiempoEstimado;
    private String tematica;
    private TipoIVA tipoIVA;

    public Pista(int id, String nombre, double precio, String tiempoEstimado, String tematica, TipoIVA tipoIVA) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoEstimado = tiempoEstimado;
        this.tematica = tematica;
        this.tipoIVA = tipoIVA;
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTiempoEstimado() {
        return tiempoEstimado;
    }

    public String getTematica() {
        return tematica;
    }

    public TipoIVA getTipoIVA() {
        return tipoIVA;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio * getTipoIVA().getPorcentaje();
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setTipoIVA(TipoIVA tipoIVA) {
        this.tipoIVA = tipoIVA;
    }

    @Override
    public String toString() {
        return "Pista = " +
                " ID = " + id +
                "| Nombre = " + nombre +
                "| Precio = " + precio +
                "| Tiempo estimado = " + tiempoEstimado +
                "| Temática = " + tematica +
                "| Tipo de IVA = " + tipoIVA;
    }
}
