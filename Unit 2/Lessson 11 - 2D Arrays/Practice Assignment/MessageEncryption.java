
/** MessageEncryption Class
  * Encrypts and unencrypts messages with a length divisible by  3
  * @author J.Burns
  * @created 19/05/2016*/
import java.util.*;

public class MessageEncryption {
    private static Scanner in = new Scanner(System.in); // The input/output Scanner
    private static String[][] encryption; // Stores the message for encryption

    /** The main method */
    public static void main(String[] args) {
        // Variable declaration
        String message; // The message to encrypt

        // Run encryption and unencryption methods
        message = in.nextLine();
        createArray(message);
        displayEncrypted();
        inputEncryptedMessage();
        displayOriginal();
    }

    /**
     * Converts the message into a 2D array for encryption
     * 
     * @param message The message to encrypt
     */
    public static void createArray(String message) {
        int num; // The number of characters in the message
        int currentLetter = 0; // The current character being added to the 2D array

        // Create a 2D array of the correct size
        num = message.length();
        encryption = new String[num / 3][3];

        // Add the characters to the 2D array row by col
        for (int x = 0; x < num / 3; x++) {
            for (int y = 0; y < 3; y++) {
                encryption[x][y] = message.substring(currentLetter, currentLetter + 1);
                currentLetter++;
            }

        }
    }

    /**
     * Displays the encrypted message
     */
    public static void displayEncrypted() {
        System.out.println("\nBefore Encryption");
        for (int x = 0; x < encryption.length; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(encryption[x][y]);
            }
        }
        // Output the message col by row
        System.out.println("\nAfter Encryption");
        for (int x = 0; x < encryption[0].length; x++) {
            for (int y = 0; y < encryption.length; y++) {
                System.out.print(encryption[y][x]);
            }

        }

    }

    /**
     * Inputs an encrypted message into a 2D array for unencryption
     */
    public static void inputEncryptedMessage() {
        // Variable declararion
        String message = in.nextLine(); // The encrypted message
        int num; // The number of charactersin the message
        int currentLetter = 0; // The current character being added to the 2D array

        // Create a 2D array of the correct size
        num = message.length();
        encryption = new String[num / 3][3];

        // Add the characters to the 2D array col by row
        for (int x = 0; x < encryption[0].length; x++) {
            for (int y = 0; y < encryption.length; y++) {
                encryption[y][x] = message.substring(currentLetter, currentLetter + 1);
                currentLetter++;
            }
        }
    }

    /**
     * Displays the unencrypted message
     */
    public static void displayOriginal() {
        // Output the message row by col
        for (int x = 0; x < encryption.length; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(encryption[x][y]);
            }
        }

    }
}