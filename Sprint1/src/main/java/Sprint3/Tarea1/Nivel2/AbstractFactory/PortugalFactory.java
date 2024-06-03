package Sprint3.Tarea1.Nivel2.AbstractFactory;

import Sprint3.Tarea1.Nivel2.Address.Address;
import Sprint3.Tarea1.Nivel2.Address.PortugalAddress;
import Sprint3.Tarea1.Nivel2.Phone.Phone;
import Sprint3.Tarea1.Nivel2.Phone.PortugalPhone;

public class PortugalFactory implements AbstractFactory {

    @Override
    public Phone createPhone(String number){
        return new PortugalPhone(number);
    }

    @Override
    public Address createAddress(String street){
        return new PortugalAddress(street);
    }


}
