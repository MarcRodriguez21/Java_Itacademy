package Sprint1.Tarea5.n1exercici5;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("BMW", 2000);
        Coche coche2 = new Coche("Mercedes", 2010);

        serializar(coche1);
    }
    static void serializar(Coche coche) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coche.ser"))) {
            out.writeObject(coche);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void deserializar() {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("coche.ser"))) {
            Coche coche = (Coche) in.readObject();
            ;System.out.println(coche.toString());
        }catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    static class Coche implements Serializable {
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
}

