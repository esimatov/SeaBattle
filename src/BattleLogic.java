import java.util.ArrayList;
import java.util.List;

public class BattleLogic {

    public ArrayList<Integer> spawnShips() {
        ArrayList<Integer> shipsOnSea = new ArrayList<>(100);
        int largeShipCoord = (int) (Math.random() * 100);
        int orientation = (int) (Math.random() * 2);
        if (orientation == 1) {
            Ship largeShip = new Ship(4, true, largeShipCoord);
            shipsOnSea.add(largeShipCoord);
            shipsOnSea.add(largeShipCoord + 1);
            shipsOnSea.add(largeShipCoord + 2);
            shipsOnSea.add(largeShipCoord + 3);
        } else {
            if (largeShipCoord > 60) largeShipCoord = largeShipCoord - 40;
            Ship largeShip = new Ship(4, false, largeShipCoord);
            shipsOnSea.add(largeShipCoord);
            shipsOnSea.add(largeShipCoord + 10);
            shipsOnSea.add(largeShipCoord + 20);
            shipsOnSea.add(largeShipCoord + 30);
        }
        return shipsOnSea;
    }

}

class BattleLogicTestDrive {
    public static void main(String[] args) {
        BattleLogic battleLogic = new BattleLogic();
        ArrayList<Integer> sea = battleLogic.spawnShips();
        for (int coord : sea) {
            System.out.println(coord);
        }
    }
}
