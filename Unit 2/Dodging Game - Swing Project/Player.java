
/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the backend services for the Dodging Game
*
* Constructor List:
* 1. Player()
*
* Public Method List:
* 1. public void setPlayerName(String name) = This method sets the value to the playerName variable
* 2. public void setPlayerPassword(String password) = This method sets the value to the playerPassword variable
* 3. public void setScore(int score) = This method sets the value to the playerScore variable
* 4. public boolean loginPlayer() = This method authenticates a user
* 5. public boolean createPlayer() = This method creates 1 new player, score will be set to 0 since it is a brand new account
* 6. public void updateState() = This method updates the view
*
* Helper Method List:
* 1. private void writeToFile(File file, String data) = This method writes specified data to a specified file
* 2. private ArrayList<String> readFile(File file) = This method reads from a specified file
* 3. private int doesExist(File file, String thingCheck) = This method checks to see if a specified Object exists in a data set
*
*/
// Import Statements
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Player extends Object {

    // Instance Variables
    private String playerName;
    private String playerPassword;
    private int playerScore;

    // Constants
    private final File PLAYER_NAME_FILE = new File("./assets/documents/playerName.txt");
    private final File PLAYER_PASSWORD_FILE = new File("./assets/documents/playerPassword.txt");
    private final File PLAYER_SCORE_FILE = new File("./assets/documents/playerScore.txt");

    /**
     * This is the Player Constructor
     * 
     * @param name
     * @param password
     */
    public Player() {

        super();

    } // Player Constructor

    /**
     * This method sets the value to the playerName variable
     * 
     * @param name
     */
    public void setPlayerName(String name) {
        this.playerName = name;
    } // setPlayerName Method

    /**
     * This method sets the value to the playerPassword variable
     * 
     * @param password
     */
    public void setPlayerPassword(String password) {
        this.playerPassword = password;
    } // setPlayerPassword Method

    /**
     * This method sets the value to the playerScore variable
     * 
     * @param score
     */
    public void setScore(int score) {
        this.playerScore = score;
    } // setScore Method

    /**
     * This method authenticates a user
     * 
     * @return if user is authentiacted or not
     */
    public boolean loginPlayer() {

        int nameIndex = this.doesExist(this.PLAYER_NAME_FILE, this.playerName);

        // If the playerName exists we then proceed to check their password
        if (nameIndex >= 0) {
            // If the players password exists at the same index as their username the
            // following will occur
            if (this.doesExist(this.PLAYER_PASSWORD_FILE, this.playerPassword) == nameIndex) {
                return true;
            }
        }
        return false; // Return false

    } // loginPlayer Method

    /**
     * This method creates 1 new player, score will be set to 0 since it is a brand
     * new account
     * 
     * @return true or false
     */
    public boolean createPlayer() {

        // If the playerName does not exist the following will occur
        if (this.doesExist(this.PLAYER_NAME_FILE, this.playerName) < 0) {
            // Writing new player data to their respective files
            this.writeToFile(this.PLAYER_NAME_FILE, this.playerName);
            this.writeToFile(this.PLAYER_PASSWORD_FILE, this.playerPassword);
            this.writeToFile(this.PLAYER_SCORE_FILE, Integer.toString(0));
            return true;
        }
        // If the playerName does exist the following will occur
        else {
            JOptionPane.showMessageDialog(null, "That player already exists!");
            return false;
        }

    } // createPlayer Method

    // Helper Methods

    /**
     * This method writes specified data to a specified file
     * 
     * @param file
     * @param data
     */
    private void writeToFile(File file, String data) {

        try {
            FileWriter fileW = new FileWriter(file);
            PrintWriter output = new PrintWriter(fileW, true);
            output.println(data);
            fileW.close();
            output.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
            System.exit(1);
        }

    } // writeToFile Method

    /**
     * This method reads from a specified file
     * 
     * @param file
     * @return data in the file as an ArrayList
     */
    private ArrayList<String> readFile(File file) {

        try {
            FileReader fileR = new FileReader(file); // Opening a stream to the file
            BufferedReader reader = new BufferedReader(fileR); // Method to read from the file
            String line = "";
            ArrayList<String> fileData = new ArrayList<String>();
            // Loop to read from the file
            while ((line = reader.readLine()) != null) {
                fileData.add(line); // Adding the data to the list
            } // while loop
              // Closing the streams
            fileR.close();
            reader.close();
            return fileData; // Returning the list
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
            System.exit(1);
        }
        return null; // Returning null if there is an error

    } // readFile Method

    /**
     * This method checks to see if a specified Object exists in a data set
     * 
     * @param file
     * @param thingCheck
     * @return index
     */
    private int doesExist(File file, String thingCheck) {
        ArrayList<String> playerSomething = this.readFile(file);

        // Loop to iterate through the data
        for (int i = 0; i < playerSomething.size(); i++) {
            if (playerSomething.get(i) == thingCheck) {
                return i; // Returns index if found in data set
            }
        } // for loop

        return -1; // Returns -1 if not found in data set

    } // playerExists Method

} // Player Class