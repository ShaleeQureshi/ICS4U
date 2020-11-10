
/*
* Last Modified: November 9, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class has the solution to question 3 using a TreeMap
*
* Constructor List:
* 1. public PhoneBook()
*
* Method List:
* 1. public void addContact(String name, String phoneNumber) = This method adds a contact to the dataset
* 2. public void removeContact(String name) = This method removes a Contact from the dataset
* 3. public void displayContents() = This method displays all of the data within the dataset
*
*/
// Import Statements
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {

    // Instance Variable
    private TreeMap<String, String> phoneBook;

    /**
     * This is the Class Constructor
     */
    public PhoneBook() {
        this.phoneBook = new TreeMap<String, String>(); // Instantiating the TreeMap
    } // Constructor

    /**
     * This method adds a contact to the dataset
     * 
     * @param name
     * @param phoneNumber
     */
    public void addContact(String name, String phoneNumber) {
        // If the Contact does not already exist in the dataset the following will occur
        if (!this.phoneBook.containsKey(name)) {
            this.phoneBook.put(name, phoneNumber);
            System.out.println("Contact has been added!");
        }
        // If the Contact already exists in the dataset the following will occur
        else {
            System.out.println("Contact Already Exists!");
        }
    } // addContact Method

    /**
     * This method removes a Contact from the dataset
     * 
     * @param name
     */
    public void removeContact(String name) {
        // If the Key exists the following will occur
        if (this.phoneBook.containsKey(name)) {
            this.phoneBook.remove(name);
        }
        // If the Key does not exist the followng will occur
        else {
            System.out.println("This Contact does not exist!");
        }
    } // removeContact Method

    /**
     * This method displays all of the data within the dataset
     */
    public void displayContents() {
        for (String key : this.phoneBook.keySet()) {
            System.out.println(key + "\t" + this.phoneBook.get(key));
        } // for loop
    } // displayContents Method

    /**
     * This method runs the entire program
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook book = new PhoneBook();
        System.out.println("Welcome to Shahrukh Qureshi's PhoneBook");

        // Loop to continue until the user exits the program
        while (true) {
            System.out.println("Add Contact (A)\tRemove Contact (R)\tView all Contacts (V)\tExit (E)");
            String data = input.nextLine();
            if (data.charAt(0) == 'A') {
                System.out.println("Enter the name of the new contact");
                String name = input.nextLine();
                System.out.println("Enter the phone number for the new contact");
                String phoneNum = input.nextLine();
                book.addContact(name, phoneNum);
            } else if (data.charAt(0) == 'R') {
                System.out.println("Enter the name of the contact");
                String name = input.nextLine();
                book.removeContact(name);
            } else if (data.charAt(0) == 'V') {
                book.displayContents();
            } else if (data.charAt(0) == 'E') {
                System.out.println("Thank you for using Shahrukh Qureshi's PhoneBook!");
                input.close();
                System.exit(0);
            } else {
                System.out.println("Invalid Option!");
            }
        } // while loop

    } // main Method

} // PhoneBook Class