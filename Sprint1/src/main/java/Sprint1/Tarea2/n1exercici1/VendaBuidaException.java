package Sprint1.Tarea2.n1exercici1;

class VendaBuidaException extends Exception {

    public VendaBuidaException(String mensaje) {
        super(mensaje);

        this.mensaje = mensaje;
    }

    private String mensaje;

    public String getMensaje() {
        return this.mensaje;
    }

}
