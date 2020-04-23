public class MegaBytesConverter {
    public static int calculateKiloByte(int kiloBytes) {
        if(kiloBytes < 0) {
            return -1;
        }
        return  Math.round(kiloBytes % 1024);
    }

    public static int calculateMegaByte(int kiloBytes) {
        if(kiloBytes < 0) {
            return -1;
        }
        return Math.round(kiloBytes / 1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kb = Math.round(kiloBytes % 1024);
            int megaBytes = Math.round(kiloBytes / 1024);
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB " + "and " + kb + " KB");
            }
        }
}
