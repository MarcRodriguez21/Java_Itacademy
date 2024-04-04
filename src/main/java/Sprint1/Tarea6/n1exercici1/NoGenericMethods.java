package Sprint1.Tarea6.n1exercici1;

public class NoGenericMethods {

    private Ordenador ordenador1;
    private Ordenador ordenador2;
    private Ordenador ordenador3;


    public NoGenericMethods(Ordenador ordenador1, Ordenador ordenador2, Ordenador ordenador3) {
        this.ordenador1 = ordenador1;
        this.ordenador2 = ordenador2;
        this.ordenador3 = ordenador3;
    }

    public Ordenador getOrdenador1() {
        return ordenador1;
    }

    public void setOrdenador1(Ordenador ordenador1) {
        this.ordenador1 = ordenador1;
    }

    public Ordenador getOrdenador2() {
        return ordenador2;
    }

    public void setOrdenador2(Ordenador ordenador2) {
        this.ordenador2 = ordenador2;
    }

    public Ordenador getOrdenador3() {
        return ordenador3;
    }
    public void setOrdenador3(Ordenador ordenador3) {
        this.ordenador3 = ordenador3;
    }
    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "ordenador1=" + ordenador1 +
                ", ordenador2=" + ordenador2 +
                ", ordenador3=" + ordenador3 +
                '}';
    }
}
