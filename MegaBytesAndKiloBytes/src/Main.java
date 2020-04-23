public class Main {
    public static void main(String[] args) {
        int kiloByte = MegaBytesConverter.calculateKiloByte(5000);
        int megaByte = MegaBytesConverter.calculateMegaByte(5000);
        System.out.println("Kilo Byte " + kiloByte + " Mega Byte "+ megaByte);
    }
}
