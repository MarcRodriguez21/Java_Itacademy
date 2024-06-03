package Sprint3.Tarea1.Nivel2.AbstractFactory;

import Sprint3.Tarea1.Nivel2.Address.Address;
import Sprint3.Tarea1.Nivel2.Phone.Phone;

public interface AbstractFactory {

    Phone createPhone(String number);
    Address createAddress(String street);
}
