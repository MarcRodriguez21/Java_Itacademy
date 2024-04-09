package Sprint1.Tarea6.n1exercici1;

public class Ordenador {

    private String marca;
    private String modelo;
    private double precio;

    public Ordenador(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + '}';
    }
}
