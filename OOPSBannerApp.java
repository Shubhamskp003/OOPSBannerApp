import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Render Banner using Map-based Character Patterns
 *
 * <p>
 * This version introduces a centralized pattern management system
 * using a {@link Map} to store ASCII banner patterns for characters.
 * The banner is rendered dynamically by looking up patterns from
 * the map and composing them row by row.
 * </p>
 *
 * <p>
 * This approach improves extensibility, modularity, and maintainability,
 * making it easy to add new characters without modifying rendering logic.
 * </p>
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Entry point of the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> characterPatternMap = buildCharacterPatternMap();

        // Render banner for the word "OOPS"
        renderBanner("OOPS", characterPatternMap);
    }

    /**
     * Builds and returns a map of characters to their ASCII banner patterns.
     *
     * <p>
     * Each character is mapped to a String array of 7 lines,
     * where each line has a width of 9 characters.
     * </p>
     *
     * @return map containing character-to-pattern mappings
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for 'O'
        patternMap.put('O', new String[]{
                "*********",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*       *",
                "*********"
        });

        // Pattern for 'P'
        patternMap.put('P', new String[]{
                "*********",
                "*       *",
                "*       *",
                "*********",
                "*        ",
                "*        ",
                "*        "
        });

        // Pattern for 'S'
        patternMap.put('S', new String[]{
                "*********",
                "*        ",
                "*        ",
                "*********",
                "        *",
                "        *",
                "*********"
        });

        return patternMap;
    }

    /**
     * Renders a banner for the given word using character patterns
     * retrieved from the provided map.
     *
     * <p>
     * The banner is printed row-by-row using nested loops and
     * {@link StringBuilder} for efficient string construction.
     * </p>
     *
     * @param word       the word to render as a banner
     * @param patternMap map containing character-to-pattern mappings
     */
    private static void renderBanner(String word, Map<Character, String[]> patternMap) {

        // Number of rows in each character pattern
        final int ROWS = 7;

        // Outer loop: iterate through each row
        for (int row = 0; row < ROWS; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Inner loop: iterate through each character in the word
            for (int i = 0; i < word.length(); i++) {

                char currentChar = word.charAt(i);
                String[] pattern = patternMap.get(currentChar);

                // Append the row of the current character
                lineBuilder.append(pattern[row]);

                // Add spacing between characters (except last)
                if (i < word.length() - 1) {
                    lineBuilder.append("  ");
                }
            }

            // Print the constructed line
            System.out.println(lineBuilder.toString());
        }
    }
}
