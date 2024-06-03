package Sprint3.Tarea1.Nivel2.Phone;

public class SpainPhone implements Phone {

    private String number;
    private static final String PREFIX = "+34";

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String showPhone() {
        return "(" + PREFIX + ") - " + number;
    }
}
