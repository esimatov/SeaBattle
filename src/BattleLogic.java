import java.util.ArrayList;
import java.util.List;

public class BattleLogic {

    public String[][] createSea() {
        String[][] sea = new String[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j < 10; j++) {
                sea[i][j] = "0";
            }
        }
        return sea;
    }

    public String[][] shot() {
        System.out.print("Enter X and Y coord in format (X,Y): ");

    }
}

class BattleLogicTestDrive {
    public static void main(String[] args) {
        BattleLogic battleLogic = new BattleLogic();
        String[][] sea = battleLogic.createSea();
        System.out.println(" X | 1 2 3 4 5 6 7 8 9 10");
        for (int i=0; i<10; i++) {
            System.out.print(" Y | ");
            for (int j=0; j < 10; j++) {
                System.out.print(sea[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
