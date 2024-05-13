package Miscelaneo;

public class Objetos {
    private int id;
    private String nombre;
    private double precio;
    private String material;
    private int stock;
    private TipoIVA tipoIva;

    public Objetos(int id, String nombre, double precio, String material, int stock, TipoIVA tipoIva) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.material = material;
        this.stock = stock;
        this.tipoIva = tipoIva;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMaterial() {
        return material;
    }

    public int getStock() {
        return stock;
    }

    public TipoIVA getTipoIva() {
        return tipoIva;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio * getTipoIva().getPorcentaje();
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTipoIva(TipoIVA tipoIva) {
        this.tipoIva = tipoIva;
    }

    @Override
    public String toString() {
        return "Objetos = " +
                " ID = " + id +
                "| Nombre = " + nombre +
                "| Precio = " + precio +
                "| Material = " + material + '\'' +
                "| Stock = " + stock +
                "| Tipo de Iva = " + tipoIva;
    }

}
