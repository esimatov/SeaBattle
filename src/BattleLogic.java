import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println("Enter the shot coords:");
        Scanner in = new Scanner(System.in);
        String guess = in.nextLine();

    }
}

class BattleLogicTestDrive {
    public static void main(String[] args) {
        BattleLogic battleLogic = new BattleLogic();
        String[][] sea = battleLogic.createSea();
        String[] alphabet = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "G"};
        int k = 0;
        System.out.println(" X | 1 2 3 4 5 6 7 8 9 10");
        for (int i=0; i<10; i++) {
            System.out.print(" " + alphabet[k++] + " | ");
            for (int j=0; j < 10; j++) {
                System.out.print(sea[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
