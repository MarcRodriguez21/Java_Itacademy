package Sprint3.Tarea1.Nivel2.AbstractFactory;

import Sprint3.Tarea1.Nivel2.Address.Address;
import Sprint3.Tarea1.Nivel2.Address.SpainAddress;
import Sprint3.Tarea1.Nivel2.Phone.Phone;
import Sprint3.Tarea1.Nivel2.Phone.SpainPhone;

public class SpainFactory implements AbstractFactory{

    @Override
    public Phone createPhone(String number) {
        return new SpainPhone(number);
    }

    @Override
    public Address createAddress(String street){
        return new SpainAddress(street);
    }
}
