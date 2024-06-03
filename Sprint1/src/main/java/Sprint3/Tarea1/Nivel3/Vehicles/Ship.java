package Sprint3.Tarea1.Nivel3.Vehicles;

public class Ship implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Ship");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerating Ship");
    }
    @Override
    public void brake() {
        System.out.println("Braking Ship");
    }
}
