package Sprint1.Tarea3.n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Month {

    private String name;

    public Month(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Month [name=" + name + "]";
    }



}