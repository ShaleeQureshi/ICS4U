
/*
* Last Modified: November 12, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the services for each student
*
* Constructor List:
* 1. public Student(String firstName, String lastName, String studentNo)
*
* Method List:
* 1. public String getFirstName()  = Getting the student's first name
* 3. public String getLastName() = This method gets the person's last name
* 4. public int getStudentNumber() = This method gets the person's student number
* 5. public int[] getMarks() = This method gets the student's marks
* 6. public String isPassing() = This method determines if the student is passing
* 7. public int getAverage() = This method determines the student's average
* 8. public int[] getSortedMarks() = This method sorts an array in Ascending order using BubbleSort
*
*/
public class Student {
     // Variable Definition
     private String firstName;
     private String lastName;
     private int studentNo;
     private int[] marks = new int[10];

     /**
      * Constructor
      * 
      * @param firstName
      * @param lastName
      * @param studentNo
      */
     public Student(String firstName, String lastName, String studentNo) {
          this.firstName = firstName;
          this.lastName = lastName;
          this.studentNo = Integer.parseInt(studentNo);

          // Randomly assigns 10 marks to a student
          for (int idx = 0; idx < marks.length; idx++) {
               marks[idx] = (int) (Math.random() * 70 + 30);
          } // for loop
     }// end of Constructor

     /**
      * Getting the student's first name
      * 
      * @return first name
      */
     public String getFirstName() {
          return this.firstName;
     } // getFirstName Method

     /**
      * This method gets the student's last name
      * 
      * @return last name
      */
     public String getLastName() {
          return this.lastName;
     } // getLastName Method

     /**
      * This method gets the student's number
      * 
      * @return
      */
     public int getStudentNumber() {
          return this.studentNo;
     } // getStudentNumber Method

     /**
      * This method gets the student's marks
      * 
      * @return student's marks
      */
     public int[] getMarks() {
          return this.marks;
     } // getMarks Method

     /**
      * This method determines if the student is passing or not
      * 
      * @return
      */
     public String isPassing() {
          int avg = this.getAverage();
          if (avg >= 50) {
               return "Yes";
          }
          return "No";
     } // isPassing Method

     /**
      * This method determines the student's average
      */
     public int getAverage() {
          int sum = 0;
          for (int i = 0; i < this.marks.length; i++) {
               sum = sum + this.marks[i];
          }
          int avg = sum / this.marks.length;
          return avg;
     } // getAverage Method

     /**
      * This method sorts an array in Ascending order using BubbleSort
      * 
      * @param a
      * @return the sorted array
      *
      */
     public int[] getSortedMarks() {

          int[] a = new int[this.marks.length];
          for (int i = 0; i < a.length; i++) {
               a[i] = this.marks[i];
          }
          int arrayLength = a.length - 1; // Placeholder value for the array's length - 1
          boolean continueLoop; // Flag

          // Loop to continue while the array is unsorted
          do {
               continueLoop = false; // Setting the Flag to false

               // Loop to traverse the array
               for (int j = 0; j < arrayLength; j++) {
                    // If the current index is smaller than the adjacent index the following will
                    // occur
                    if (a[j] > a[j + 1]) {
                         int temp = a[j]; // Creating a temp variable
                         // Swapping the current index with its adjacent index
                         a[j] = a[j + 1];
                         a[j + 1] = temp; // Making the adjacent index equal to the temp variable
                         continueLoop = true; // Setting the Flag to true
                    }
               } // for loop

               arrayLength--; // Subtracting 1 from the loop counter to narrow in on the array

          } while (continueLoop); // While the Flag is true we keep traversing the array

          return a; // Returing the sorted array

     } // getSortedMarks Method

} // end of Student class