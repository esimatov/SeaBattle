
public abstract class Ship {

    private String name;
    private int size;
    private String[] coords;

    public Ship(String name, int size, String[] coords) {
        this.name = name;
        this.size = size;
        this.coords = coords;
    }

    public void destroy() {
        System.out.println("!!! Ship " + name + " has been destroyed");
    }

    public void hit() {
        System.out.println("!!! You hit ship " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String[] getCoords() {
        return coords;
    }

    public void setCoords(String[] coords) {
        this.coords = coords;
    }
}
