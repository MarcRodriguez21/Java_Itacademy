package Sprint1.Tarea5.n1exercici5;

import java.io.Serializable;

public  class Coche implements Serializable {
    private String marca;
    private int modelo;
    public Coche(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}