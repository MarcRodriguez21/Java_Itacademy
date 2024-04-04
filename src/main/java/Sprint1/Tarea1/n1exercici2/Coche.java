package Sprint1.Tarea1.n1exercici2;

public class Coche {

    private static final String MARCA = "Audi";
    private static String model;
    private final int POTENCIA;

    public Coche(String model, int potencia) {
        this.model = model;
        this.POTENCIA = potencia;

    }


    public String toString() {
        return "Marca: " + MARCA + ", Modelo: " + model + ", Potencia: " + POTENCIA + " caballos.";
    }


    public static String getModel() {
        return model;
    }


    public static void setModel(String model) {
        Coche.model = model;
    }


    public static String getMarca() {
        return MARCA;
    }


    public int getPotencia() {
        return POTENCIA;
    }

    public static void frenar() {
        System.out.println("El coche esta frenando.");
    }

    public void acelerar() {
        System.out.println("El coche esta acelerando.");
    }









}
