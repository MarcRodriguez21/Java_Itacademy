package Items;

public class Item {

    private String nombre;
    private String tipo;
    private double precio;
    private double desgaste;

    public Item(String nombre, String tipo, double precio, double desgaste){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.desgaste = desgaste;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getPrecio(){
        return this.precio;
    }

    public double getDesgaste(){
        return this.desgaste;
    }

    public void setDesgaste(double desgaste){
        this.desgaste = desgaste;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", desgaste=" + desgaste +
                '}';
    }
}
