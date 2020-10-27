
/*
* Last Modified: October 27, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the solution to question 4 -> Contact List
*
* Constructor List:
* 1. Person(String firstName, String lastName, int age, String phoneNumber, int grade)
*
* Method List:
* 1. public void changeGrade(int grade) = This method changes the person's grade
* 2. public String getFirstName() = This method gets the person's first name
* 3. public String getLastName() = This method gets the person's last name
* 4. public int getAge() = This method gets the person's age
* 5. public String getPhoneNumber() = This method gets the person's phone number
* 6. public int getGrade() = This method gets the person's grade
*
*/
public class Person {

    // Variables
    private String firstName, lastName, phoneNumber;
    private int age, grade;

    /**
     * Constructor
     * 
     * @param firstName
     * @param lastName
     * @param age
     * @param phoneNumber
     * @param grade
     */
    public Person(String firstName, String lastName, int age, String phoneNumber, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    } // Constructor

    /**
     * This method changes the person's grade
     * 
     * @param grade
     */
    public void changeGrade(int grade) {
        this.grade = grade;
    } // changeGrade Method

    /**
     * This method gets the person's first name
     * 
     * @return first name
     */
    public String getFirstName() {
        return this.firstName;
    } // getFirstName Method

    /**
     * This method gets the person's last name
     * 
     * @return last name
     */
    public String getLastName() {
        return this.lastName;
    } // getlastName Method

    /**
     * This method gets the person's age
     * 
     * @return age
     */
    public int getAge() {
        return this.age;
    } // getAge Method

    /**
     * This method gets the person's phone number
     * 
     * @return phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    } // getPhoneNumber Method

    /**
     * This method gets the person's grade
     * 
     * @return grade
     */
    public int getGrade() {
        return this.grade;
    } // getGrade Method

} // Person Class
