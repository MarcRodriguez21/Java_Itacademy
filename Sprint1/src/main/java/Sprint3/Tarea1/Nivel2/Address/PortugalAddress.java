package Sprint3.Tarea1.Nivel2.Address;

public class PortugalAddress implements Address{

    private String street;
    private static final String COUNTRY = "Portugal";
    private static final String COUNTRY_CODE = "PT";
    public PortugalAddress(String street) {
        this.street = street;
    }

    @Override
    public String showAddress() {
        return COUNTRY + " " + COUNTRY_CODE + " " + this.street;
    }
}
