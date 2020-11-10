import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Tic-Tac-Toe program! This is a virtual simulation of a two-player game of tic-tac-toe.\n");
        System.out.println("Here are the instructions:\n");
        System.out.println("1. If a box has a number value, then you can put your symbol there, and if not, it's taken by the other player.\n");
        System.out.println("2. You can't go twice in a row.\n");
        System.out.println("3. The first player to get 3 boxes in a vertical, horizontal, or diagonal line wins.\n");
        System.out.println("Good luck!\n");
        String table[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        /*for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Player one, your move. Which box would you like to take?");
                String boxTaken = s.nextLine();
                if (boxTaken.length() != 1) {
                    System.out.println("You didn't use the proper syntax. Try again.");
                    i -= 1;
                    continue;
                } else {
                    if (boxTaken.substring(0, 1) == "A"){
                        table[0][Integer.parseInt(boxTaken.substring(1)) - 1] = "X";
                    } else if (boxTaken.substring(0, 1) == "B") {
                        table[1][Integer.parseInt(boxTaken.substring(1)) - 1] = "X";
                    } else {
                        table[2][Integer.parseInt(boxTaken.substring(1)) - 1] = "X";
                    }
                }
            } else {
                System.out.println("Player two, your move. Which box would you like to take?");
                String boxTaken = s.nextLine();
                if (boxTaken.length() != 2) {
                    System.out.println("You didn't use the proper syntax. Try again.");
                    i -= 1;
                    continue;
                } else {
                    if (boxTaken.substring(0, 1) == "A"){
                        table[0][Integer.parseInt(boxTaken.substring(1)) - 1] = "O";
                    } else if (boxTaken.substring(0, 1) == "B") {
                        table[1][Integer.parseInt(boxTaken.substring(1)) - 1] = "O";
                    } else {
                        table[2][Integer.parseInt(boxTaken.substring(1)) - 1] = "O";
                    }
                }
            }
        }
    }*/
    drawTable(table);
}
    public static void drawTable(String[][] table) {
        System.out.println("--------------");
        System.out.println(table[0][0] +"  |  " + table[0][1] + "  |  " + table[0][2]);
        System.out.println("--------------");
        System.out.println(table[1][0] + "  |  " + table[1][1] + "  |  " + table[1][2]);
        System.out.println("--------------");
        System.out.println(table[2][0] + "  |  " + table[2][1] + "  |  " + table[2][2]);
        System.out.println("--------------");
    }
}

