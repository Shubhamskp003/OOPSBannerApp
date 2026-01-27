/**
 * OOPSBannerApp UC6 – Banner Display Application using Helper Methods
 *
 * Version History:
 *  - v1.0: Printed "OOPS" as plain text.
 *  - v2.0: Rendered "OOPS" as a banner using string concatenation (+).
 *  - v3.0: Refactored banner rendering using String.join().
 *  - v4.0: Used String array and loop to eliminate repetitive print statements.
 *  - v5.0: Used inline array initialization with String.join().
 *  - v6.0: Refactored banner logic into reusable helper methods
 *          following DRY and modular design principles.
 *
 * This class demonstrates method abstraction by separating
 * character pattern generation into dedicated helper methods.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Get individual character patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Create banner lines by composing character patterns
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
            );
        }

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method to build letter 'O' pattern
    private static String[] getOPattern() {
        return new String[] {
                "*********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*********"
        };
    }

    // Helper method to build letter 'P' pattern
    private static String[] getPPattern() {
        return new String[] {
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        };
    }

    // Helper method to build letter 'S' pattern
    private static String[] getSPattern() {
        return new String[] {
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        };
    }
}
