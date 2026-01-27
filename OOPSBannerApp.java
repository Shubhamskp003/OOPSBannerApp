/**
 * OOPSBannerApp UC4 – Banner Display Application using String Array and Loop
 *
 * Version History:
 *  - v1.0: Printed "OOPS" as plain text.
 *  - v2.0: Rendered "OOPS" as a banner using string concatenation (+).
 *  - v3.0: Refactored banner rendering using String.join().
 *  - v4.0: Refactored banner rendering using a String array and loop
 *          to eliminate repetitive print statements and improve maintainability.
 *
 * This class demonstrates how to store banner lines in a String array
 * and print them using a loop for better code organization and reusability.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create a String array to store all 7 banner lines
        String[] bannerLines = new String[7];

        // Step 2: Populate the array using String.join()

        bannerLines[0] = String.join("  ",
                "*********",
                "*********",
                "*********",
                "*********"
        );

        bannerLines[1] = String.join("  ",
                "*       *",
                "*       *",
                "*       *",
                "*        "
        );

        bannerLines[2] = String.join("  ",
                "*       *",
                "*       *",
                "*       *",
                "*        "
        );

        bannerLines[3] = String.join("  ",
                "*       *",
                "*       *",
                "*********",
                "*********"
        );

        bannerLines[4] = String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "*        "
        );

        bannerLines[5] = String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "*        "
        );

        bannerLines[6] = String.join("  ",
                "*********",
                "*********",
                "*        ",
                "*********"
        );

        // Step 3: Use enhanced for loop to print each banner line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
fg