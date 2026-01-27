/**
 * OOPSBannerApp UC5 - OOPS Banner Display Application using Inline Array Initialization
 *
 * This class demonstrates inline initialization of a String array
 * combined with String.join() to efficiently render a banner.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {

    /*
        Main method to run banner display
        1. Creating and initializing string array inline.
        2. Constructing banner lines using String.join().
        3. Using enhanced for-loop to print each line.
    */
    public static void main(String[] args) {

        // UC5: Inline array initialization with String.join()
        String[] lines = {

                // Line 1
                String.join("  ",
                        "*********",
                        "*********",
                        "*********",
                        "*********"
                ),

                // Line 2
                String.join("  ",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*        "
                ),

                // Line 3
                String.join("  ",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*        "
                ),

                // Line 4
                String.join("  ",
                        "*       *",
                        "*       *",
                        "*********",
                        "*********"
                ),

                // Line 5
                String.join("  ",
                        "*       *",
                        "*       *",
                        "*        ",
                        "*        "
                ),

                // Line 6
                String.join("  ",
                        "*       *",
                        "*       *",
                        "*        ",
                        "*        "
                ),

                // Line 7
                String.join("  ",
                        "*********",
                        "*********",
                        "*        ",
                        "*********"
                )
        };

        // Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
