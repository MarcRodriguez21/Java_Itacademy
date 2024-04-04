package Sprint1.Tarea1.n2exercici1;

public class Smartphone extends Telefono implements Camara, Reloj {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Fotografiando ...");
    }

    @Override
    public void alarma() {
        System.out.println("Está sonando la alarma...");
    }


}
