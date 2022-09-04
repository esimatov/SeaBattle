import java.util.ArrayList;
import java.util.List;

public class BattleLogic {

    public ArrayList<Integer> largeShipSpawner() {
        ArrayList<Integer> sea = new ArrayList<>(100);
        int randomCoord = (int) (Math.random() * 100);
        Ship largeShip;
        if (randomCoord >= 61) {
            ArrayList<Integer> coords = new ArrayList<>();
            coords.add(randomCoord);
            coords.add(randomCoord+1);
            coords.add(randomCoord+2);
            coords.add(randomCoord+3);
            largeShip = new Ship("Princess Victoria (Large Ship)", coords);
        } else {
            ArrayList<Integer> coords = new ArrayList<>();
            coords.add(randomCoord);
            coords.add(randomCoord+10);
            coords.add(randomCoord+20);
            coords.add(randomCoord+30);
            largeShip = new Ship("Princess Victoria (Large Ship)", coords);
        }
        sea.addAll(largeShip.getCoords());
        return sea;
    }
    public ArrayList<Integer> bigShipSpawner(ArrayList<Integer> sea) {

        int randomCoord = (int) (Math.random() * 100);
        Ship largeShip;
        if (randomCoord >= 71) {
            ArrayList<Integer> coords = new ArrayList<>();
            coords.add(randomCoord);
            coords.add(randomCoord+1);
            coords.add(randomCoord+2);
            largeShip = new Ship("President Ruzvelt (Large Ship)", coords);
        } else {
            ArrayList<Integer> coords = new ArrayList<>();
            coords.add(randomCoord);
            coords.add(randomCoord+10);
            coords.add(randomCoord+20);
            largeShip = new Ship("President Ruzvelt (Large Ship)", coords);
        }
        sea.addAll(largeShip.getCoords());
        return sea;
    }

}

class BattleLogicTestDrive {
    public static void main(String[] args) {
        BattleLogic battleLogic = new BattleLogic();
        ArrayList<Integer> sea = battleLogic.largeShipSpawner();
        for (int coord : sea) {
            System.out.println(coord);
        }
    }
}
