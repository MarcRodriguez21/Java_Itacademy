package Salas;

import Miscelaneo.Objetos;
import Miscelaneo.Pista;

import java.util.ArrayList;

public class Sala {

    private static int idCounter = 0;
    private int id;
    private String nombre;
    private TipoDificultad tipoDificultad;
    private double precioSala;
    private ArrayList<Pista> pistas = new ArrayList<>();
    private ArrayList<Objetos> objetos = new ArrayList<>();

    public Sala(int id, String nombre, TipoDificultad tipoDificultad, double precioSala, ArrayList<Pista> pistas, ArrayList<Objetos> objetos) {
        this.id = ++idCounter;
        this.nombre = nombre;
        this.tipoDificultad = tipoDificultad;
        this.precioSala = precioSala;
        this.pistas = pistas;
        this.objetos = objetos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDificultad() {
        return tipoDificultad.name();
    }

    public double getPrecioSala() {
        return precioSala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDificultad(TipoDificultad tipoDificultad) {
        this.tipoDificultad = tipoDificultad;
    }

    public void setPrecioSala(double precioSala) {
        this.precioSala = precioSala;
    }

    public ArrayList<Pista> getPistas() {
        return pistas;
    }

    public ArrayList<Objetos> getObjetos() {
        return objetos;
    }

    public void setPistas(ArrayList<Pista> pistas) {
        this.pistas = pistas;
    }

    public void setObjetos(ArrayList<Objetos> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "Sala = " +
                " ID = " + id +
                "| Nombre = " + nombre +
                "| Nivel de dificultad = " + tipoDificultad +
                "| Precio sala = " + precioSala +
                "| Pistas = " + pistas +
                "| Objetos = " + objetos;
    }

    public void setPrecio(double precioSala) {
        this.precioSala = precioSala;
    }
}
