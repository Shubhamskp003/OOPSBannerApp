/**
 * OOPSBannerApp UC3 – Banner Display Application using String.join()
 *
 * Version History:
 *  - v1.0: Printed "OOPS" as plain text.
 *  - v2.0: Rendered "OOPS" as a banner using string concatenation (+).
 *  - v3.0: Refactored banner rendering using String.join() to
 *          improve memory efficiency and readability.
 *
 * This class demonstrates how String.join() can be used
 * to efficiently construct multi-line ASCII art banners.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("  ",
                "*********",
                "*********",
                "*********",
                "*********"
        ));

        // Line 2
        System.out.println(String.join("  ",
                "*       *",
                "*       *",
                "*       *",
                "*        "
        ));

        // Line 3
        System.out.println(String.join("  ",
                "*       *",
                "*       *",
                "*       *",
                "*        "
        ));

        // Line 4
        System.out.println(String.join("  ",
                "*       *",
                "*       *",
                "*********",
                "*********"
        ));

        // Line 5
        System.out.println(String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "*        "
        ));

        // Line 6
        System.out.println(String.join("  ",
                "*       *",
                "*       *",
                "*        ",
                "*        "
        ));

        // Line 7
        System.out.println(String.join("  ",
                "*********",
                "*********",
                "*        ",
                "*********"
        ));
    }
}
