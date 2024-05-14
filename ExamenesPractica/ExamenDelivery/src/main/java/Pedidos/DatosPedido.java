package Pedidos;

import Exceptions.RepartidorNoLibres;
import Personas.Cleinte;
import Personas.Repartidor;
import Personas.TipoDesplazamiento;
import Productos.*;

import java.util.*;

public class DatosPedido {

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    private static Cleinte cliente1 = new Cleinte("Marc", "Eslida 5");
    private static Cleinte cliente2 = new Cleinte("Dani", "Eslida 5");
    private static Cleinte cliente3 = new Cleinte("Martín", "Eslida 5");
    private static Cleinte cliente4 = new Cleinte("Bilal", "Eslida 5");

    private static Repartidor repartidor1 = new Repartidor("Luis", true , TipoDesplazamiento.BICICLETA);
    private static Repartidor repartidor2 = new Repartidor("Edu", true , TipoDesplazamiento.MOTO);
    private static Repartidor repartidor3 = new Repartidor("Pablo", true , TipoDesplazamiento.PIE);

    private static List<Cleinte> clientes = List.of(cliente1, cliente2, cliente3, cliente4);
    private static List<Repartidor> repartidores = List.of(repartidor1, repartidor2, repartidor3);
    private static List<Pedido> pedidos = new ArrayList<>();
    private static List<Pedido> pedidosEntregados = new ArrayList<>();

    List<Producto> productos = new ArrayList<>();


    //Crear un pedido
    public static void crearPedido() throws RepartidorNoLibres {

        Repartidor repartidor;
        Cleinte cliente;
        List<Producto> productos;

        cliente = escogerCliente();
        repartidor = escogerRepartidor();
        productos = (List<Producto>) añadirAlCarrito();


        if (repartidor == null) {
            System.out.println("No se ha podido crear el pedido");
        } else if (cliente == null) {
            System.out.println("No se puede crear un pedido sin cliente");
        } else if(productos.isEmpty()){
            System.out.println("No se puede crear un pedido sin productos.");
        }else {
            Pedido pedido = new Pedido(cliente, repartidor, productos);
            pedido.setEntregado(false);
            pedidos.add(pedido);
            System.out.println("Se ha creado el pedido");
        }
    }
    private static Cleinte escogerCliente() {
        try {
            System.out.println("Escoge un cliente");
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println((i + 1) + ". " + clientes.get(i).getNombre());
            }
            int clienteEscogido;
            try {
                clienteEscogido = sc.nextInt() - 1;
            } catch (InputMismatchException e) {
                sc.next();
                throw new InputMismatchException("Error: Se esperaba un número entero para seleccionar el cliente.");
            }

            if (clienteEscogido < 0 || clienteEscogido >= clientes.size()) {
                throw new IndexOutOfBoundsException("Error: El número de cliente ingresado está fuera de los límites.");
            }

            return clientes.get(clienteEscogido);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    private static Repartidor escogerRepartidor() {
        try {
            if(repartidores.stream().allMatch(Repartidor -> !Repartidor.isDisponible())){
                throw new RepartidorNoLibres("No hay repartidores disponibles");
            }
            int randomInt = random.nextInt(repartidores.size());
            boolean dispoible = false;

            do{
                if(repartidores.get(randomInt).isDisponible()){
                    dispoible = true;
                    repartidores.get(randomInt).setDisponible(false);
                    return repartidores.get(randomInt);
                }
                randomInt = random.nextInt(repartidores.size());
            }while(!dispoible);
        } catch (RepartidorNoLibres exception) {
            System.out.println("Lo sentimos, no hay repartidores disponibles en este momento.");
        }
        return null;
    }
    public static void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos para mostrar.");
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". Cliente:  " + pedidos.get(i).getCliente().getNombre());
            System.out.println((i + 1) + ". Repartidor: " + pedidos.get(i).getRepartidor().getNombre());
            System.out.println((i + 1) + ". Tipo de reparto: " + pedidos.get(i).getRepartidor().getTipoDesplazamiento());
            System.out.println((i + 1) + ". Productos: " + pedidos.get(i).getProductos());
            System.out.println((i + 1) + ". Precio total + tipo de reparto: " + pedidos.get(i).calcularPrecioTotal()) ;
            System.out.println((i + 1) + ". Entregado: " + pedidos.get(i).isEntregado());
        }
    }

    private static List<Producto> añadirAlCarrito() {
        List<Producto> productos = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Escoge una opción:");
                System.out.println("1. Añadir producto");
                System.out.println("2. Terminar pedido");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        Producto producto = escogerProductos();
                        if (producto != null) {
                            productos.add(producto);
                        }
                        break;
                    case 2:
                        return productos;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                sc.next();
            }
        }
    }
    private static Producto escogerProductos() {

        while (true) {
            try {
                System.out.println("Escoge un producto");
                System.out.println("1. Kebab");
                System.out.println("2. Pizza");
                System.out.println("3. Hamburguesa");
                System.out.println("4. Burrito");
                int productoEscogido = sc.nextInt();

                switch (productoEscogido) {
                    case 1:
                        return new Kebab();
                    case 2:
                        return new Pizza();
                    case 3:
                        return new Hamburguesa();
                    case 4:
                        return new Burrito();
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona un número válido del 1 al 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número entero. Por favor, intenta nuevamente.");
                sc.next();
            }
        }
    }

    public static void marcarEntregado() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos para marcar como entregados.");
            return;
        }

        try {
            System.out.println("Escribe el número del pedido que quieres marcar como entregado");

            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println((i + 1) + ". " + pedidos.get(i).getCliente().getNombre());
            }
            int pedidoEscogido;
            try {
                pedidoEscogido = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next(); // Limpiar el buffer
                throw new InputMismatchException("Error: Se esperaba un número entero para seleccionar el pedido.");
            }

            if (pedidoEscogido < 1 || pedidoEscogido > pedidos.size()) {
                throw new IndexOutOfBoundsException("Error: El número de pedido ingresado está fuera de los límites.");
            }

            pedidos.get(pedidoEscogido - 1).setEntregado(true);
            pedidosEntregados.add(pedidos.get(pedidoEscogido - 1));
            dejarRepartidorLibre(pedidos.get(pedidoEscogido - 1).getRepartidor());
            pedidos.remove(pedidoEscogido - 1);

            System.out.println("El pedido ha sido marcado como entregado y el repartidor ha quedado libre.");
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void dejarRepartidorLibre(Repartidor repartidor) {
        repartidor.setDisponible(true);
    }

    public static void mostrarPedidosEntregados() {
        if (pedidosEntregados.isEmpty()) {
            System.out.println("No hay pedidos entregados.");
            return;
        }
        for (int i = 0; i < pedidosEntregados.size(); i++) {
            System.out.println((i + 1) + ". Cliente:  " + pedidosEntregados.get(i).getCliente().getNombre());
            System.out.println((i + 1) + ". Repartidor: " + pedidosEntregados.get(i).getRepartidor().getNombre());
            System.out.println((i + 1) + ". Productos: " + pedidosEntregados.get(i).getProductos());
            System.out.println((i + 1) + ". Precio total: " + pedidosEntregados.get(i).calcularPrecioTotal());
            System.out.println((i + 1) + ". Entregado: " + pedidosEntregados.get(i).isEntregado());
        }
    }
}
