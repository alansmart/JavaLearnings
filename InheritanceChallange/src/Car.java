public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGears;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGears ) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGears = 1;
    }

    public void changeGear(int currentGears) {
        this.currentGears = currentGears;
        System.out.println("Car.setcurrentGear changed to " + this.currentGears + " Gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.velocityChange() : velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
        changeGear(1);
    }
}
