import java.util.Scanner;

public static void wordLengths(Scanner console) {
    int[] counts = new int[81];
    
    while (console.hasNext()) {
        String token = console.next();
        counts[token.length()]++;
    }
    
    for (int i = 1; i < counts.length; i++) {
        if (counts[i] > 0) {
            System.out.print(i + ": " + counts[i] + "\t");
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}