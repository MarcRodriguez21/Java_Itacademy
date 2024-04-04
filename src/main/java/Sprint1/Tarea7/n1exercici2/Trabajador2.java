package Sprint1.Tarea7.n1exercici2;

public abstract class Trabajador2 {

    private String nombre;
    private String apellidos;
    private int precioHora;


    public Trabajador2(String nombre, String apellidos, int precioHora) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.precioHora = precioHora;
    }

    public float calcularSalario(int horas) {
        return precioHora * horas;
    }


    public int getPrecioHora() {
        return precioHora;
    }
    public String getNombre() {
            return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}


