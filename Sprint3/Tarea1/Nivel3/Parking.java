package Sprint3.Tarea1.Nivel3;

import Sprint3.Tarea1.Nivel3.Commands.AccelerateCommand;
import Sprint3.Tarea1.Nivel3.Commands.BrakingCommand;
import Sprint3.Tarea1.Nivel3.Commands.Command;
import Sprint3.Tarea1.Nivel3.Commands.StartingCommand;
import Sprint3.Tarea1.Nivel3.Invoker.Invoker;
import Sprint3.Tarea1.Nivel3.Vehicles.*;

public class Parking {

    public static void start(){
        Invoker commands = new Invoker();

        executeOrders(commands, new Car());
        executeOrders(commands, new Bike());
        executeOrders(commands, new Plane());
        executeOrders(commands, new Ship());
    }

    public static void executeOrders(Invoker commands, Vehicle vehicle) {
        commands.setStart(new StartingCommand(vehicle));
        commands.setAccelerate(new AccelerateCommand(vehicle));
        commands.setBrake(new BrakingCommand(vehicle));

        commands.executeCommands();
    }

}
