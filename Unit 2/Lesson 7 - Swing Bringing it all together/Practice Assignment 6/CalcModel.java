/*
* Last Modified: October 29, 2020
* Author: Shalee (Shahrukh) Qureshi
* Description: This class contains the backend services for the Calculator (Model)
*
* Constructor List:
* 1. CalcModel()
*
* Method List:
* 1. public void setGUI(CalcView view) = This method sets the view for the Calculator
* 2. public void setNum1(double num1) = This method sets the value to num1
* 3. public void setNum2(double num2) = This method sets the value to num2
* 4. public void performOperations(String operation) = This method performs the 4 operations available for the Calculator
* 5. public double getAnswer() = This method returns the answer
* 6. public void updateState() = This method updates the view
*
*/
// Import Statements

public class CalcModel extends Object {

    // Instance Variables
    private CalcView calcView;
    public static final int MAX_DIGITS = 5; // Represents the max number of digits the user can enter
    private double answer, num1, num2; // Represents the answer

    /**
     * This is the CalcModel Constructor
     */
    public CalcModel() {
        super();
    } // CalcModel Contructor

    /**
     * This method sets the view for the Calculator
     * 
     * @param view
     */
    public void setGUI(CalcView view) {
        this.calcView = view;
    } // setGUI Method

    /**
     * This method sets the value to num1
     * 
     * @param num1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    } // setNum1 Method

    /**
     * This method sets the value to num2
     * 
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    } // num2 Method

    /**
     * This method performs the 4 operations available for the Calculator
     * 
     * @param operation
     */
    public void performOperations(String operation) {

        // Switch statement to perform a task based on the given operation
        switch (operation) {
            case "+":
                this.answer = this.num1 + this.num2;
                break;
            case "-":
                this.answer = this.num1 - this.num2;
                break;
            case "÷":
                this.answer = this.num1 / this.num2;
                break;
            case "x":
                this.answer = this.num1 / this.num2;
                break;
            default:
                this.answer = 0;
        } // switch

        this.updateState(); // Updatingthe UI

    } // performOperations Method

    /**
     * This method returns the answer
     * 
     * @return the answer
     */
    public double getAnswer() {
        return this.answer;
    } // getAnswer Method

    /**
     * This method updates the view
     */
    public void updateState() {
        calcView.update();
    } // updateState Method

} // CalcModel Class
