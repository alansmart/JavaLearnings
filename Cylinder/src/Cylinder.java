public class Cylinder extends Circle {

    private double height;

    public Cylinder(double height) {
        super(4.0);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        double area = super.getArea();
        return (area * height);
    }
}
