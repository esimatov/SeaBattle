public class Ship {
    private int size;
    private boolean orientation;

    private int startCoord;

    public Ship(int size, boolean orientation, int startCoord) {
        this.size = size;
        this.orientation = orientation;
        this.startCoord = startCoord;
    }

    public int getStartCoord() {
        return startCoord;
    }

    public void setStartCoord(int startCoord) {
        this.startCoord = startCoord;
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
