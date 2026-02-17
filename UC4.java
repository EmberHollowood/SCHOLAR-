public class UC4 {
    public static void main(String[] args) {
        System.out.println("OOPS using String Array and Enhanced For-Loop:\n");
        
        String[] bannerLines = {
            String.join(" ", "   ***   ", "   ***    " , "*********  " , "   ***** "),
            String.join(" ", " **   ** ", " **   **  " , "**     **  " , " **     "),
            String.join(" ", "**     **", "**      **" , "**     **  " , "**       "),
            String.join(" ", "**     **", "**      **" , "** ** **   " , "  ***** "),
            String.join(" ", "**     **", "**      **" , "**         " , "      **"),
            String.join(" ", " **   ** ", " **   **  " , "**         " , " **   ** "),
            String.join(" ", "   ***   ", "   ***    " , "**         " , "  ***** ")
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
        System.out.println();
    }
}

