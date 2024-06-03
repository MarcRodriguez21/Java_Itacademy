package Sprint3.Tarea1.Nivel3.Commands;

import Sprint3.Tarea1.Nivel3.Vehicles.Vehicle;

public class StartingCommand implements Command {
    private Vehicle vehicle;

    public StartingCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void execute() {
        vehicle.start();
    }
}
