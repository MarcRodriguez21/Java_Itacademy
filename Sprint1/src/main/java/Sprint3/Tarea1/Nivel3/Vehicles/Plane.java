package Sprint3.Tarea1.Nivel3.Vehicles;

public class Plane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Plane");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerating Plane");
    }
    @Override
    public void brake() {
        System.out.println("Braking Plane");
    }
}
