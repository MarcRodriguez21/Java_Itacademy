package Sprint3.Tarea1.Nivel2.Phone;

public class PortugalPhone implements Phone {

    private String number;
    private static final String PREFIX = "+351";

    public PortugalPhone(String number) {
        this.number = number;
    }

    @Override
    public String showPhone() {
        return "("+ PREFIX + ") - " + this.number;
    }
}
