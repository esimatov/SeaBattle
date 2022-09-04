import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ship {

    private String name;
    private ArrayList<Integer> coords;


    public Ship(String name, ArrayList<Integer> coords) {
        this.name = name;
        this.coords = coords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getCoords() {
        return coords;
    }

    public void setCoords(ArrayList<Integer> coords) {
        this.coords = coords;
    }



}
