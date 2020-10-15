import java.awt.*;

/**
 * @author J.Burns
 * @since 07/10/13 A simple Robot that is able to turn and move
 */
public class CustomSimpleBot extends Paintable {

    // Declare Variables
    private int street; // The current street
    private int avenue; // The current avenue
    private int direction; // The current direction
    private Color color; // Robot color
    private int streetStep = 0; // How far the robot is between intersections
    private int avenueStep = 0; // Takes 4 steps to cross the intersection

    // Constants to represent direction
    private final int EAST = 0;
    private final int SOUTH = 1;
    private final int WEST = 2;
    private final int NORTH = 3;

    /**
     * Default constructor that creates a CustomSimpleBot at a user specified
     * location
     * 
     * @param street The starting street value
     * @param avenue The starting avenue value
     */
    public CustomSimpleBot(int street, int avenue) {
        super();
        this.street = street;
        this.avenue = avenue;
        this.direction = this.EAST;
    } // Constructor

    /**
     * Displays the SimpleBot
     * 
     * @param g The graphics object
     */
    public void paint(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillOval(this.avenue * 50, this.street * 50, 50, 50);
    } // paint Method

    /**
     * Moves the SimpleBot forward one intersection in the direction it is facing
     */
    public void move() {
        this.street = this.street + this.streetOffset();
        this.avenue = this.avenue + this.avenueOffset();

        // Taking 4 steps
        for (int step = 0; step <= 4; step++) {
            this.moveWithSteps();
        } // for loop

        this.streetStep = 0;
        this.avenueStep = 0;
        this.street = this.street + this.streetOffset();
        this.avenue = this.avenue + this.avenueOffset();

    } // move Method

    // This method moves using 4 distinct steps
    private void moveWithSteps() {

        // Incrementing or Decrementing based on direction
        if (direction == NORTH) {
            this.streetStep--;
        } else if (direction == SOUTH) {
            this.streetStep++;
        } else if (direction == EAST) {
            this.avenueStep++;
        } else {
            this.avenueStep--;
        }

        // Slowing down the thread 400 ms
        try {
            Thread.sleep(400);
        } catch (Exception error) {
            System.out.println(error);
        }

    } // moveWithSteps Method

    // Modifies the current avenue when moving based on the direction of the
    // SimpleBot
    private int avenueOffset() {
        int offset = 0; // the amount to change the current street by
        if (this.direction == this.EAST)// moving East
        {
            offset = 1;
        } else if (this.direction == this.WEST)// moving West
        {
            offset = -1;
        }
        return offset;
    } // avenueoffset Method

    // Modifies the current street when moving based on the direction of the
    // SimpleBot
    private int streetOffset() {
        int offset = 0; // the amount to change the current avenue by
        if (this.direction == this.NORTH)// moving North
        {
            offset = -1;
        } else if (this.direction == this.SOUTH)// moving South
        {
            offset = 1;
        }
        return offset;

    } // streetOffset Method

    /** Turns the SimpleBot 90 degrees to the Left */
    public void turnLeft() {
        if (this.direction == this.EAST)// Turn to face north
        {
            this.direction = this.NORTH;
        } else {
            this.direction -= 1;
        }
        try {
            Thread.sleep(400);
        } catch (Exception error) {
            System.out.println(error);
        }

    } // turnLeft Method

    // This method turns the SimplBot 90 degrees to the Right
    public void turnRight() {

        if (this.direction == this.EAST) {
            this.direction = this.NORTH;
        } else {
            this.direction++;
        }

    } // turnRight Method

    // This method teleports the SimpleBot to a given location
    public void teleport(int street, int avenue) {

        this.street = street; // Making the current street the inputted street
        this.avenue = avenue; // Making the current avenue the inputted avenue

        // Slowing the thread down 400 milliseconds
        try {
            Thread.sleep(400);
        } catch (Exception error) {
            System.out.println(error);
        }

    } // teleport Method

    // This method allows the user to set the color of the robot
    public void setColor(Color color) {

        this.color = color;

    } // setColor Method

    // This method allows the user to set the color of the robot using RGB values
    public void setColorRGB(int r, int g, int b) {

        this.color = new Color(r, g, b);
    } // setColorRGB Method

    // This method tests the SimpleBot
    public static void main(String[] args) {

        // Instantiating Objects
        SimpleCity myCity = new SimpleCity();
        CustomSimpleBot myRobot = new CustomSimpleBot(0, 0);

        // Initialize City
        myCity.add(myRobot, 2);
        myCity.waitForStart();

        // Moving the Robot
        myRobot.move();
        myRobot.move();
        myRobot.turnRight();
        myRobot.move();
        myRobot.teleport(4, 4);

    } // Main Method
}