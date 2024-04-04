package Sprint1.Tarea3.n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Month> meses = new ArrayList<Month>();


        Month enero = new Month("enero");
        Month febrero = new Month("febrero");
        Month marzo = new Month("marzo");
        Month abril = new Month("abril");
        Month mayo = new Month("mayo");
        Month junio = new Month("junio");
        Month julio = new Month("julio");
        Month septiembre = new Month("septiembre");
        Month octubre = new Month("octubre");
        Month noviembre = new Month("noviembre");
        Month diciembre = new Month("diciembre");

        meses.add(enero);
        meses.add(febrero);
        meses.add(marzo);
        meses.add(abril);
        meses.add(mayo);
        meses.add(junio);
        meses.add(julio);
        meses.add(septiembre);
        meses.add(octubre);
        meses.add(noviembre);
        meses.add(diciembre);

        Month agosto = new Month("agosto");
        meses.add(7, agosto);

        System.out.println("--------Impresión lista de meses en ArraList--------");
        System.out.println();

        for(int i = 0; i < meses.size(); i++) {
            String mes = meses.get(i).getName();
            System.out.println(mes);
        }
        System.out.println();
        System.out.println("--------Impresión lista de meses en HashSet--------");
        System.out.println();

        HashSet<Month> mesesIterator = new HashSet<>(meses);

        //En un Hashset los objetos y variables se guardan de manera aleatoria en la memoria, por eso al imprimir la lista salen aleatorios


        mesesIterator.add(agosto);


        Iterator<Month> iterador = mesesIterator.iterator();

        for(int i = 0; i < meses.size(); i++) {
            String mes = iterador.next().getName();
            System.out.println(mes);
        }

        //Como vemos añado otra vez el mes agosto y solo se imprime una vez, ya que el hashset no admite valores repetidos al contrario que un ArrayList
        System.out.println();
        System.out.println("******************");






    }

}

