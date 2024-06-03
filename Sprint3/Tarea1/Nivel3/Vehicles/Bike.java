package Sprint3.Tarea1.Nivel3.Vehicles;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Bike");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerating Bike");
    }
    @Override
    public void brake() {
        System.out.println("Braking Bike");
    }
}
