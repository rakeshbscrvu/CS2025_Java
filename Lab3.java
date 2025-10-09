class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    protected int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println(brand + " car with " + doors + " doors is starting.");
    }
}

class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String brand, int doors, int batteryCapacity) {
        super(brand, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        super.start();
        System.out.println(brand + " electric car with " + batteryCapacity + "kWh battery is ready to go.");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic");
        Car c = new Car("Toyota", 4);
        ElectricCar e = new ElectricCar("Tesla", 4, 100);

        v.start();
        c.start();
        e.start();
    }
}
