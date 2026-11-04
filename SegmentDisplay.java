
import java.util.Scanner;

public class SegmentDisplay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an 8-bit binary value (or exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            
            char[][] display = new char[5][4];

            
            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 4; col++) {
                    display[row][col] = ' ';
                }
            }

            
            boolean A = input.charAt(0) == '1';
            boolean B = input.charAt(1) == '1';   
            boolean C = input.charAt(2) == '1';
            boolean D = input.charAt(3) == '1';
            boolean E = input.charAt(4) == '1';
            boolean F = input.charAt(5) == '1';
            boolean G = input.charAt(6) == '1';

            
            if (A) {
                display[0][0] = '#';
                display[0][1] = '#';
                display[0][2] = '#';
                display[0][3] = '#';
            }

            
            if (F) {
                display[1][0] = '#';
            }

           
            if (B) {
                display[1][3] = '#';
            }

            
            if (G) {
                display[2][0] = '#';
                display[2][1] = '#';
                display[2][2] = '#';
                display[2][3] = '#';
            }

            
            if (E) {
                display[3][0] = '#';
            }

            
            if (C) {
                display[3][3] = '#';
            }

            
            if (D) {
                display[4][0] = '#';
                display[4][1] = '#';
                display[4][2] = '#';
                display[4][3] = '#';
            }

            
            System.out.println();

            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 4; col++) {
                    System.out.print(display[row][col]);
                }
                System.out.println();
            }

            System.out.println();
        }

        scanner.close();
    }
}

