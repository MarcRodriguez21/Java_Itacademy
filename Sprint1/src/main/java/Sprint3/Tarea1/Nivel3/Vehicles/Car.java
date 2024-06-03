package Sprint3.Tarea1.Nivel3.Vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting Car");
    }
    @Override
    public void accelerate() {
        System.out.println("Accelerating Car");
    }
    @Override
    public void brake() {
        System.out.println("Braking Car");
    }
}
