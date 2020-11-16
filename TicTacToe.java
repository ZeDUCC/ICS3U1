    import java.util.Scanner;

    public class TicTacToe {
        
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to the Tic-Tac-Toe program! This is a virtual simulation of a two-player game of tic-tac-toe.\n");
            System.out.println("Here are the instructions:\n");
            System.out.println("1. If a box has a number value, then you can put your symbol there, and if not, it's taken by the other player.\n");
            System.out.println("2. You can't go twice in a row.\n");
            System.out.println("3. The first player to get 3 boxes in a vertical, horizontal, or diagonal line wins.\n");
            System.out.println("4. The first player uses X, and the second player uses O.\n");
            System.out.println("Good luck!\n");
            String table[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
            drawTable(table);
            loop:
            for (int i = 0; i < 9; i++) {
                String inputVal = "";
                if (i % 2 == 0) {
                    System.out.println("Player one, your move. Which box would you like to take?");
                    inputVal = "X";
                } else {
                    System.out.println("Player two, your move. Which box would you like to take?");
                    inputVal = "O";
                }
                String boxTaken = s.nextLine();
                if (boxTaken.length() != 1) {
                    System.out.println("You didn't use the proper syntax. Try again.");
                    i--;
                    continue;
                } else {
                    int boxNum = Integer.parseInt(boxTaken);
                    if ((boxNum > 0 && boxNum < 4) && (table[0][boxNum - 1] != "X" && table[0][boxNum - 1] != "O")) {
                        table[0][boxNum - 1] = inputVal;
                    } else if ((boxNum >= 4 && boxNum < 7) && (table[1][boxNum - 4] != "X" && table[1][boxNum - 4] != "O")) {
                        table[1][boxNum - 4] = inputVal;
                    } else if ((boxNum >= 7 && boxNum < 10) && (table[2][boxNum - 7] != "X" && table[2][boxNum - 7] != "O")) {
                        table[2][boxNum - 7] = inputVal;
                    } else {
                        System.out.println("That box has been taken. Please try again.");
                        i--;
                        continue;
                    }
                }
                drawTable(table);
                if (i >= 4) {
                    for (int j = 0; j < 9; j++) {
                        if ((j >= 0 && j < 3) && (table[0][j].equals(table[1][j]) && table[0][j].equals(table[2][j]))) { //straight line from top down
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2])) { //top left to bottom right
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else if (table[2][0].equals(table[1][1]) && table[0][2].equals(table[2][j])) { //bottom left to top right
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else if (table[2][0].equals(table[2][1]) && table[2][2].equals(table[2][0])) { //bottom row left to right
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else if (table[0][0].equals(table[0][1]) && table[0][0].equals(table[0][2])) { //top row left to right
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else if (table[1][0].equals(table[1][1]) && table[1][0].equals(table[1][2])) { //middle row left to right
                            System.out.println("There is a winner! Congratulations!");
                            drawTable(table);
                            break loop;
                        } else {
                            continue;
                        }
                    }
                }
            }
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