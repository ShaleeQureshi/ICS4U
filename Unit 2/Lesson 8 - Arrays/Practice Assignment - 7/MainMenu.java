
/** A menu system that interacts with the ContactList class to allow the user to create a list of contacts and be able to 
 *  add, remove, display, or sort the people in the contact list. 
 * @since 04/11/13
 * @author J Burns */

import java.io.*;
import java.util.*;

public class MainMenu {

    /** Main method */
    public static void main(String[] args) {
        // Variable Declarations
        ContactList myBook; // The book of contacts
        int userChoice; // The user's menu selection
        int numberOfContacts; // The number of contacts currently in the Address book
        Boolean runProgram = true; // Flag for determining if the user wants to keep running the program

        // Make a new playlist with the number of spaces for songs that the user
        // specifies
        numberOfContacts = Prompt.getInt("How many contacts would you like in your Address Book?");
        myBook = new ContactList(numberOfContacts);

        System.out.println();
        System.out.println("Welcome to Address Book, what would you like to do?");

        // While the user wishes the run the program
        while (runProgram) {
            userChoice = getUserChoice();

            // Menu Selections
            switch (userChoice) {
                case 1: // Add Contact
                    addContact(myBook);
                    myBook.displayBook();
                    break;
                case 2: // Remove Contact
                    removeContact(myBook);
                    myBook.displayBook();
                    break;
                case 3: // Change Rating
                    changeRating(myBook);
                    myBook.displayBook();
                    break;
                case 4: // Display Contact List
                    myBook.displayBook();
                    break;
                case 5: // Quit
                    runProgram = false;
                    break;
                default: // If user inputs an invalid number
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    /**
     * Displays the menu options for the user
     * 
     * @returns Menu selection
     */
    private static int getUserChoice() {
        // Variable Declarations
        int choice; // Menu selection

        choice = Prompt.getInt(
                "(1) Add New Contact\t(2) Remove Contact\t(3) Change Contact Rating\t(4) Display Contacts\t(5) Quit.");

        return (choice);
    }

    /** Adding a song to the Contact List */
    private static void addContact(ContactList myBook) {
        // Variable Declarations
        String firstName; // First Name of contact
        String lastName; // Last Name of contact
        int age; // Age of contact
        String phoneNumber; // Phone Number of contact
        int grade; // Grade (1-4) of contact

        // Get user input for the specifics of the song then add it to the playlist with
        // the addSong method
        firstName = Prompt.getString("Please enter the first name: ");

        lastName = Prompt.getString("Please enter the last name: ");

        age = Prompt.getInt("Please enter the age: ");

        phoneNumber = Prompt.getString("Please enter the phone number: ");

        grade = Prompt.getInt("Please enter the grade (1 to 4): ");

        if (grade > 0 && grade < 5)
            myBook.addPerson(firstName, lastName, age, phoneNumber, grade);
        else
            System.out.println("Invalid grade");
    }

    /** Removes a contact from the book */
    private static void removeContact(ContactList myBook) {
        // Variable Declarations
        int contactNumber; // The number of the contact to be removed

        // Allow user to select person for removal
        myBook.displayBook();

        contactNumber = Prompt.getInt("Please enter the number of the person you would like to delete:");

        myBook.removePerson(contactNumber - 1);
    }

    /** Changing the grade of a contact in the book */
    private static void changeRating(ContactList myBook) {
        // Variable Declarations
        int newGrade; // The new grade of the contact
        int contactNumber; // The number of the contact to be changed

        // Allow user to select contact for changing
        myBook.displayBook();
        contactNumber = Prompt.getInt("Please enter the number of the contact you would like to modify:");

        newGrade = Prompt.getInt("What would you like to change it to?");

        myBook.changeGrade(contactNumber, newGrade);
    }
}