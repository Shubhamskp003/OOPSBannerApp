/**
 * OOPSBannerApp UC7 – Render OOPS Banner using Character Pattern Class
 *
 * <p>
 * This version introduces a dedicated inner static class {@code CharacterPattern}
 * to encapsulate a character and its corresponding 7-line banner pattern.
 * The banner rendering logic now retrieves patterns from these objects,
 * improving modularity, reusability, and maintainability.
 * </p>
 *
 * <p>
 * OOPS Principles Demonstrated:
 * <ul>
 *   <li>Encapsulation</li>
 *   <li>Abstraction</li>
 *   <li>Modularity</li>
 *   <li>Single Responsibility Principle</li>
 * </ul>
 * </p>
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Entry point of the application.
     *
     * <p>
     * This method creates character pattern objects, assembles
     * the "OOPS" banner row-by-row using stored patterns, and
     * prints the final banner.
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create CharacterPattern objects for required characters
        CharacterPattern oPattern = new CharacterPattern(
                'O',
                new String[]{
                        "*********",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*********"
                }
        );

        CharacterPattern pPattern = new CharacterPattern(
                'P',
                new String[]{
                        "*********",
                        "*       *",
                        "*       *",
                        "*********",
                        "*        ",
                        "*        ",
                        "*        "
                }
        );

        CharacterPattern sPattern = new CharacterPattern(
                'S',
                new String[]{
                        "*********",
                        "*        ",
                        "*        ",
                        "*********",
                        "        *",
                        "        *",
                        "*********"
                }
        );

        // Array of CharacterPattern objects (O, O, P, S)
        CharacterPattern[] wordPatterns = {
                oPattern,
                oPattern,
                pPattern,
                sPattern
        };

        // Build and print banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int col = 0; col < wordPatterns.length; col++) {
                lineBuilder.append(wordPatterns[col].getPattern()[row]);

                // Add spacing between characters (not after last)
                if (col < wordPatterns.length - 1) {
                    lineBuilder.append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Inner static class that encapsulates a character
     * and its corresponding banner pattern.
     *
     * <p>
     * Each instance represents one character and stores
     * its 7-line ASCII banner representation.
     * </p>
     */
    private static class CharacterPattern {

        /** The character represented by this pattern */
        private final char character;

        /** The 7-line banner pattern for the character */
        private final String[] pattern;

        /**
         * Constructs a CharacterPattern with a character and its pattern.
         *
         * @param character the character to represent
         * @param pattern   a 7-line banner pattern for the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character represented by this pattern.
         *
         * @return the character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern for the character.
         *
         * @return a String array containing the banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }
}
