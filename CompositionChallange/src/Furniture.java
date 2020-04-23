public class Furniture {
    private int bed;
    private int sofa;
    private int chair;
    private int fans;

    public Furniture(int bed, int sofa, int chair, int fans) {
        this.bed = bed;
        this.sofa = sofa;
        this.chair = chair;
        this.fans = fans;
    }

    public int getBed() {
        return bed;
    }

    public int getSofa() {
        return sofa;
    }

    public int getChair() {
        return chair;
    }

    public int getFans() {
        return fans;
    }
}
