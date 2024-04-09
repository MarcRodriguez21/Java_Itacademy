package Sprint1.Tarea1.n1exercici1;

abstract class Instrument {


    private String nom;
    private int preu;
    static String staticNumber = "Valor estatico de la superclase";


    public Instrument(String nom, int preu) {
        super();
        this.nom = nom;
        this.preu = preu;
    }

    static {
        System.out.println(staticNumber);
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getPreu() {
        return preu;
    }


    public void setPreu(int preu) {
        this.preu = preu;
    }



    public abstract void tocar();


}

