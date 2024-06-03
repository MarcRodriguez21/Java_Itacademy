package Sprint3.Tarea1.Nivel3.Commands;

import Sprint3.Tarea1.Nivel3.Vehicles.Vehicle;

public class BrakingCommand implements Command {
    private Vehicle vehicle;

    public BrakingCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void execute() {
        vehicle.brake();
    }
}
