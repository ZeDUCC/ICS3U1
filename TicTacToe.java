import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i > grid.length; i++) {
            System.out.println("Enter the row number of your box: ");
            int row = s.nextInt();
            System.out.println("Enter the column number of your box: ");
            int col = s.nextInt();
            if (grid[row][col] == 0) {
                if (i % 2 == 0) {
                    grid[row][col] = 1;
                } else {
                    grid[row][col] = 2;
                }
            } else {
                System.out.println("That box is filled.");
                if (i != 0) {
                    i -= 1;
                } else {
                    i = 0;
                }
                continue;
            }
        }
    }
}
