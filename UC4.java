/**
 * UC4 - OOPS Banner App using Arrays and Loops
 * 
 * This program improves upon UC3 by:
 * - Storing banner lines in a String array
 * - Using enhanced for-loop to print them
 * - Achieving better modularity and reusability
 * - Reducing code repetition
 */
public class UC4 {
    public static void main(String[] args) {
        System.out.println("OOPS using String Array and Enhanced For-Loop:\n");
        
        // Store all banner lines in a String array
        // Each line contains ASCII art patterns for the letters O, O, P, S
        String[] bannerLines = {
            String.join(" ", "   ***   ", "   ***    " , "*********  " , "   ***** "),
            String.join(" ", " **   ** ", " **   **  " , "**     **  " , " **     "),
            String.join(" ", "**     **", "**      **" , "**     **  " , "**       "),
            String.join(" ", "**     **", "**      **" , "** ** **   " , "  ***** "),
            String.join(" ", "**     **", "**      **" , "**         " , "      **"),
            String.join(" ", " **   ** ", " **   **  " , "**         " , " **   ** "),
            String.join(" ", "   ***   ", "   ***    " , "**         " , "  ***** ")
        };
        
        // Print banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
        System.out.println();
    }
}

