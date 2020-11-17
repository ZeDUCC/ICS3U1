import java.util.Scanner;

public class MJ {

    public static void main(String[] args) {
        System.out.println("Welcome to the TicTacToe program!\n");
        System.out.println("The rules are simple! There will be only two players allowed per game. No retries, nobody can go twice, and first to have 3 of their symbols in a row (diagonally, vertically, or horizontally) wins!\n");
        
        String[][] gameBoard = {{"$", "|", "$", "|","$"}, {"-", "-", "-", "-", "-"}, {"$", "|", "$", "|","$"}, {"-", "-", "-", "-", "-"}, {"$", "|", "$", "|","$"}};
        
        board(gameBoard);
        System.out.println("\n");
        opportunitiesAndErrors(gameBoard);
        
    }
    
    public static void opportunitiesAndErrors(String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);
        int row = 0;
        int col = 0;
        int r = 0;
        String symbol = "";
        System.out.println("Player 1 will be using the symbol X and Player 2 will be using the symbol O.\n");
                        
        while (r < 9) {	
            boolean done = false;
            if (r % 2 == 0) {
                System.out.println("Player 1 it's your turn.\n");
                symbol = "X";
            } else {
                System.out.println("Player 2 it's your turn.\n");
                symbol = "O";
            }
            
            System.out.println("\n");
            board(gameBoard);
            System.out.println("\n");
            System.out.println("Please enter your row number (0, 2, 4).\n");
            row = keyboard.nextInt();
            System.out.println("Please enter your column number (0, 2, 4).\n");
            col = keyboard.nextInt();
                        
            if (row >= 0 && row <= 4 && row % 2 == 0 && col >= 0 && col <= 4 && col % 2 == 0) {
                
                if (gameBoard[row][col] == "$") {
                    gameBoard[row][col] = symbol;
                } else {
                    System.out.println("Spots taken. Please try again.\n");
                    continue;
                }

                board(gameBoard);
                System.out.println("\n");
            } else {
                System.out.println("You've entered a invalid answer. Please try again.");
                continue;
            }
            r++;
            if (gameBoard[0][0] == gameBoard[0][2] && gameBoard[0][2] == gameBoard[0][4] && gameBoard[0][4] != "$") {
                System.out.println("You've won the game. Good job!\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[2][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[2][4] && gameBoard[2][4] != "$") {
                System.out.println("You've won the game. Good job!\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[4][0] == gameBoard[4][2] && gameBoard[4][2] == gameBoard[4][4] && gameBoard[4][4] != "$") {
                System.out.println("You've won the game. Good job!\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[0][0] == gameBoard[2][0] && gameBoard[2][0] == gameBoard[4][0] && gameBoard[4][0] != "$") {
                System.out.println("You've won the game. Good job!\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[0][2] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][2] && gameBoard[4][2] != "$") {
                System.out.println("You've won the game. Good job.\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[0][4] == gameBoard[2][4] && gameBoard[2][4] == gameBoard[4][4] && gameBoard[4][4] != "$") {
                System.out.println("You've won the game. Good job.\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[0][0] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][4] && gameBoard[4][4] != "$") {
                System.out.println("You've won the game. Good job.\n");
                board(gameBoard);
                done = true;
            } else if (gameBoard[0][4] == gameBoard[2][2] && gameBoard[2][2] == gameBoard[4][0] && gameBoard[4][0] != "$") {
                System.out.println("You've won the game. Good job.\n");
                board(gameBoard);
                done = true;
            } 
        
            if (done) {
                break;
            }
        }
    }
    
    public static void board(String[][] gameBoard) {
        
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                System.out.print(gameBoard[row][col]);
            }
            System.out.println();
        }
    }
    
}
