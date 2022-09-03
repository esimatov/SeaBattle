public class Ship {
    private int size;
    private boolean orientation;

    public Ship(int size, boolean orientation) {
        this.size = size;
        this.orientation = orientation;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOrientation() {
        return orientation;
    }

    public void setOrientation(boolean orientation) {
        this.orientation = orientation;
    }
}
