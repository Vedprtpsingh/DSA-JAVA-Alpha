public class Pattern {
    public static void main(String[] args) {
        int n = 7; // the height of the pattern
        int middleValue = 2*n-1; // the middle value
        int startValue = n; // the starting value for the lowest row
        
        // Calculate the number of rows
        int rows = n / 2 + 1;
        
        // Loop to print the upper part of the pattern including the middle row
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < (rows - i - 1); j++) {
                System.out.print("  ");
            }
            // Print the values
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j == i) {
                    System.out.print(middleValue + " ");
                } else {
                    System.out.print((startValue + (2 * (rows - i - 1))) + " ");
                }
            }
            System.out.println();
        }
        
        // Loop to print the lower part of the pattern
        for (int i = rows - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < (rows - i - 1); j++) {
                System.out.print("  ");
            }
            // Print the values
            for (int j = 0; j < (2 * i + 1); j++) {
                if (j == i) {
                    System.out.print(middleValue + " ");
                } else {
                    System.out.print((startValue + (2 * (rows - i - 1))) + " ");
                }
            }
            System.out.println();
        }
    }
}