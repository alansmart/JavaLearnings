public class House {

    private int walls;
    private int roof;
    private int doors;

    public House(int walls, int roof, int doors) {
        this.walls = walls;
        this.roof = roof;
        this.doors = doors;
    }

    public int getWalls() {
        return walls;
    }

    public int getRoof() {
        return roof;
    }

    public int getDoors() {
        return doors;
    }
}
