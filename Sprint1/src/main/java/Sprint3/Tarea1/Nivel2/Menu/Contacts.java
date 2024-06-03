package Sprint3.Tarea1.Nivel2.Menu;

import Sprint3.Tarea1.Nivel2.Address.Address;
import Sprint3.Tarea1.Nivel2.Phone.Phone;

public class Contacts {
    private String name;
    private Phone number;
    private Address address;

    public Contacts(String name, Phone number, Address address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Phone getNumber() {
        return number;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Phone number) {
        this.number = number;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contacts [name=" + name + ", number=" + this.number.showPhone() + ", address=" + this.address.showAddress() + "]";
    }
}
