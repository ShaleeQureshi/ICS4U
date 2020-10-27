
/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 4 -> Contact List
*
* Constructor List:
* 1. ContactList() = Creates an empty contact list with 100 pages
* 2. ContactList(int listSize) = Creates a contact list at a user specified size
*
* Method List:
* 1. public void addPerson(String firstName, String lastName, int age, String phoneNumber, int grade) = This method creates a new entry in the book from the provided data
* 2. public void removePerson(int personIndex) = This method removes a person from the list and moves everyone else up an index
* 3. public void displayBook() = This method displays all of the information in the contact list
* 4. public void changeGrade(int personIndex, int newGrade) = This method changes a specified person's grade
*
*/

public class ContactList {

    // Variables
    private Person[] contact;
    private int bookIndex;
    final private int LIST_SIZE;

    /**
     * Creates an empty Contact List with 100 pages
     */
    public ContactList() {
        this.contact = new Person[100];
        this.bookIndex = 0;
        this.LIST_SIZE = 100;
    } // Constructor

    /**
     * Creates a ContactList at a user specified length
     * 
     * @param listSize
     */
    public ContactList(int listSize) {
        this.contact = new Person[listSize];
        this.bookIndex = 0;
        this.LIST_SIZE = listSize;
    } // Constructor

    /**
     * This method creates a new entry in the book from the provided data
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param phoneNumber
     * @param grade
     */
    public void addPerson(String firstName, String lastName, int age, String phoneNumber, int grade) {

        Person newPerson = new Person(firstName, lastName, age, phoneNumber, grade);

        if (this.bookIndex < this.LIST_SIZE) {
            this.contact[this.bookIndex] = newPerson;
            this.bookIndex++;
        } else {
            System.out.println("Can't add a new person your Contact List is full!");
        }

    } // addPerson Method

    /**
     * This method removes a person from the list and moves everyone else up an
     * index
     * 
     * @param personIndex
     */
    public void removePerson(int personIndex) {

        // Loop to iterate through the contact list
        for (int i = personIndex; i < this.bookIndex - 1; i++) {
            this.contact[i] = this.contact[i + 1];
        } // for loop

        this.contact[this.bookIndex - 1] = null;
        this.bookIndex--;

    } // removePerson Method

    /**
     * This method displays all of the information in the contact list
     */
    public void displayBook() {

        // Loop to iterate through each person in the list
        for (int i = 0; i < this.bookIndex; i++) {
            System.out.println("First Name: " + this.contact[i].getFirstName() + "\tLast Name: "
                    + this.contact[i].getLastName() + "\tAge: " + this.contact[i].getAge() + "\tPhone Number: "
                    + this.contact[i].getPhoneNumber() + "\tGrade: " + this.contact[i].getGrade() + "\n");
        }

    } // displayBook Method

    /**
     * This method changes a specified person's grade
     * 
     * @param personIndex
     * @param newGrade
     */
    public void changeGrade(int personIndex, int newGrade) {
        this.contact[personIndex - 1].changeGrade(newGrade);
    } // changeGrade Method

} // ContactList Class
