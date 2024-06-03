package Sprint3.Tarea1.Nivel2.Address;

public class SpainAddress implements Address{
    private String street;
    private static final String COUNTRY = "Spain";
    private static final String COUNTRY_CODE = "ES";
    public SpainAddress(String street) {
        this.street = street;
    }

    @Override
    public String showAddress() {
        return COUNTRY + " " + COUNTRY_CODE + " " + this.street;
    }
}
