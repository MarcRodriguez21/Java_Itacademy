package Pedidos;

import Personas.Cleinte;
import Personas.Repartidor;
import Personas.TipoDesplazamiento;
import Productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private static int nextId = 1;

    private Cleinte cliente;

    private Repartidor repartidor;

    private List<Producto> productos = new ArrayList<Producto>();
    private double precio;

    public boolean entregado = false;


    public Pedido(Cleinte cliente, Repartidor repartidor, List<Producto> productos) {
        this.id = nextId++;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.productos = productos;
        precio = calcularPrecioTotal();
    }


    private String productosString(){
        StringBuilder sb = new StringBuilder();
        for (Producto producto : productos){
            sb.append(producto.toString());
        }
        return sb.toString();
    }


    public int getId() {
        return id;
    }


    public Cleinte getCliente() {
        return cliente;
    }


    public Repartidor getRepartidor() {
        return repartidor;
    }


    public List<Producto> getProductos() {
        return productos;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", repartidor=" + repartidor +
                ", productos=" + productos +
                ", precio=" + precio +
                ", entregado=" + entregado +
                '}';
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        double porcentajeExtra;
        if (repartidor.getTipoDesplazamiento() == TipoDesplazamiento.BICICLETA) {
            porcentajeExtra = 0.01;
        } else if (repartidor.getTipoDesplazamiento() == TipoDesplazamiento.MOTO) {
            porcentajeExtra = 0.02;
        } else {
            porcentajeExtra = 0;
        }
        precioTotal += precioTotal * porcentajeExtra;
        return  precioTotal;
    }


}
