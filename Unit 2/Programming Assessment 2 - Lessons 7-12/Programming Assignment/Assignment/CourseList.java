
/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the mainmenu
*
* Method List:
* 1. public static void main(String[] args) = This method rusn the entire program
*
* Helper Methods:
* 1. private static int getUserChoice() = This method gets the user's choice
* 2.  private static void outputData(int[] array) = This method outputs the data
*/
import java.util.*;

public class CourseList {
     // Variable Declarations
     static Scanner in = new Scanner(System.in); // Scanner for reading user input

     /** Main method */
     public static void main(String[] args) {
          // Variable Declarations

          int userChoice; // The user's menu selection
          Boolean runProgram = true; // Flag for determining if the user wants to keep running the program

          // Array to initialize course list (format is first name, last name, student
          // number}
          String[][] initializeArray = { { "Hasan", "Ahmed", "462948" }, { "Abdul", "Alvi", "764226" },
                    { "Omar", "Askalany", "719049" }, { "Harsim", "Grewal", "438629" }, { "Anis", "Habib", "576510" },
                    { "Hamiz", "Hasan", "621802" }, { "Bilal", "Hussain", "417440" },
                    { "Mazhar", "Jabakhan", "603544" }, { "Tharsh", "Kamalan", "447615" },
                    { "Rohan", "Kanjani", "443604" } };

          // Setup an ordered collection class of students using the values in
          // initializeArray
          ArrayList<Student> students = new ArrayList<Student>();
          // Loop to initialize the array with data from initializeArray
          for (int i = 0; i < initializeArray.length; i++) {
               students.add(new Student(initializeArray[i][0], initializeArray[i][1], initializeArray[i][2]));
          } // for loop

          System.out.println();
          System.out.println("Welcome, what would you like to do?");

          // While the user wishes the run the program
          while (runProgram) {
               userChoice = getUserChoice();
               int index = 0;
               int array[];
               // Menu Selections
               switch (userChoice) {
                    case 1: // Show selected Student information
                         index = Prompt.getInt("Please enter the index of the student you wish to see"); // Getting the
                                                                                                         // index
                         // Outputting the data in regards to the index entered
                         System.out.println("First Name: " + students.get(index).getFirstName() + " Last Name: "
                                   + students.get(index).getLastName() + " No: "
                                   + students.get(index).getStudentNumber() + "\n Sorted Marks\n");
                         array = students.get(index).getSortedMarks(); // Initializing the array with the student's
                                                                       // sorted marks
                         // Outputting the data
                         outputData(array);
                         break;
                    case 2: // Delete Student
                         index = Prompt.getInt("Please enter the index of the student you wish to delete"); // Getting
                                                                                                            // the index
                         students.remove(index); // Removing the student
                         break;

                    case 3: // Show Course Student list
                         int i = 0; // Counter
                         // Loop to output the data from the ArrayList
                         for (Student student : students) {
                              array = student.getMarks(); // Getting the student's marks

                              // Outputting the data
                              System.out.println((i + 1) + "- First Name: " + student.getFirstName() + " Last Name: "
                                        + student.getLastName() + " No: " + student.getStudentNumber() + "\nAverage: "
                                        + student.getAverage() + " Is Passing: " + student.isPassing() + "\nMarks:");
                              // Outputting the data
                              outputData(array);
                              System.out.println("\n"); // Skipping a line for the next iteration
                              i++; // Adding 1 to the counter
                         } // for loop
                         break;
                    case 0: // Quit
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

          System.out.println();
          System.out.println("(1) Show Student Information\t(2) Delete Student\t(3) Show Class List");
          System.out.println("Enter 0 to quit");

          choice = Integer.parseInt(in.nextLine());

          return (choice);
     }

     /**
      * This method outputs the data
      * 
      * @param array
      */
     private static void outputData(int[] array) {
          // Loop to output the data
          for (int i = 0; i < array.length; i++) {
               System.out.print(array[i] + " ");
          } // for loop
     }

}