package Sprint1.Tarea1.n2exercici1;


public class Telefono {

    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void llamar(String numero) {
        System.out.println("Llamando a " + numero + " ... ... ...");
    }


}
