import java.util.*;

public class FloodFillAlgorithm {

    // Helper function to handle the recursive DFS traversal
    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // Base Cases: 
        // 1. Out of boundary conditions
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return;
        }
        // 2. Already visited pixel
        if (vis[sr][sc]) {
            return;
        }
        // 3. Pixel color does not match the original starting color
        if (image[sr][sc] != orgCol) {
            return;
        }

        // Action: Mark current pixel as visited and update its color
        vis[sr][sc] = true;
        image[sr][sc] = color;

        // Recursive Calls for 4-directional neighbors:
        // Left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // Right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // Up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // Down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    // Main floodFill function called by the user
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Create a tracking matrix to avoid infinite loops/re-visitations
        boolean[][] vis = new boolean[image.length][image[0].length];
        
        // Capture the original color of the starting coordinates
        int orgCol = image[sr][sc];
        
        // Initiate the recursive helper function
        helper(image, sr, sc, color, vis, orgCol);
        
        return image;
    }

    public static void main(String[] args) {
        // Sample Input matrix from the lecture slide
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        
        int sr = 1;
        int sc = 1;
        int color = 2;

        System.out.println("Original Image Matrix:");
        printMatrix(image);

        // Execute Flood Fill
        int[][] result = floodFill(image, sr, sc, color);

        System.out.println("\nImage Matrix After Flood Fill:");
        printMatrix(result);
    }

    // Utility method to cleanly print the 2D grid matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}