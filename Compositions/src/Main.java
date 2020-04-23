import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(223, 450, 150);
        Case theCase = new Case("225B", "Lenovo", "230", dimensions);
        Monitor monitor = new Monitor("332A", "Acer", 40, new Resolution(1025, 1000));

        Motherboard motherboard = new Motherboard("83ABJ", "Asus", "4", "4", "8");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMotherboard().loadProgram("Winndows 10");
        pc.getMonitor().drawPixel(12, 30, "red");
    }
}
