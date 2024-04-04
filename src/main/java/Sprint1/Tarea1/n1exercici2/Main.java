package Sprint1.Tarea1.n1exercici2;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        // El modelo al ser static se comparte entre todas las instancias y puedo cambiarlo mas abajo por eso solo existe el setter de este.
        // La marca al ser static final se comparte pero no se puede cambiar de ninguna manera
        // La potencia al ser final una vez instanciado el objeto no se puede cambiar


        Coche.frenar();

        Coche coche1 = new Coche("RS3",200);
        Coche coche2 = new Coche("RS",300);

        coche1.acelerar();

        System.out.println(coche1);
        System.out.println(coche2);

        coche2.setModel("Chorizo");
        System.out.println(coche2);
        System.out.println(coche1);

    }

}

