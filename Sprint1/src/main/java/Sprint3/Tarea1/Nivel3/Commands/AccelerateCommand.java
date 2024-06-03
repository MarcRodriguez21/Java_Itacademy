package Sprint3.Tarea1.Nivel3.Commands;

import Sprint3.Tarea1.Nivel3.Vehicles.Vehicle;

public class AccelerateCommand implements Command {
    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }


}
