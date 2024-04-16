package Sprint1.Tarea1.n1exercici1;

abstract class Instrument {


    protected String nom;
    protected int preu;
    protected static String staticNumber = "Valor estatico de la superclase";


    public Instrument(String nom, int preu) {
        this.nom = nom;
        this.preu = preu;
    }

    static {
        System.out.println(staticNumber);
    }


    public void setNom(String nom) {
        this.nom = nom;
    }



    public void setPreu(int preu) {
        this.preu = preu;
    }



    public abstract void tocar();


}

