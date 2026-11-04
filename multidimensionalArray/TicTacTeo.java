import java.util.Scanner;

public class TicTacTeo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char[][] board = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        char player = 'X';
        int totalMoves = 0; 
        
        while (totalMoves < 9) {
           
            System.out.println("\n " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
            
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == 1) board[0][0] = player;
            else if (number == 2) board[0][1] = player;
            else if (number == 3) board[0][2] = player;
            else if (number == 4) board[1][0] = player;
            else if (number == 5) board[1][1] = player;
            else if (number == 6) board[1][2] = player;
            else if (number == 7) board[2][0] = player;
            else if (number == 8) board[2][1] = player;
            else if (number == 9) board[2][2] = player;
            

            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
            
            totalMoves = totalMoves + 1;
        }
        
        System.out.println("\n " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        
    }
}g