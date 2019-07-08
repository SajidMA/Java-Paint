// Sajid Ahmed
// Lab 1 Problem 3
// Purpose: Determine how much paint is needed to paint the walls of a room
// given its length, width, height, doors, and windows
package paint;

/**
 *
 * @author Sajid Ahmed
 */
import java.util.Scanner;
public class Paint {

    
    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        final int DOOR = 20; //Each door is 20 sq ft
        final int WINDOW = 15; //Each window is 15 sq ft
        //declare integers length, width, height, doors, and windows;
        int length, width, height, doors, windows;
        //declare double totalSqFt;
        double totalSqFt;
        //declare double paintNeeded;
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner scan = new Scanner (System.in);
        //Prompt for and read in the length of the room
        System.out.print("Enter length: ");
        length = scan.nextInt();
        //Prompt for and read in the width of the room
        System.out.print("Enter width: ");
        width = scan.nextInt();
        //Prompt for and read in the height of the room
        System.out.print("Enter height: ");
        height = scan.nextInt();
        //Prompt for and read in the number of doors in the room
        System.out.print("Enter number of doors: ");
        doors = scan.nextInt();
        //Prompt for and read in the number of windows in the room
        System.out.print("Enter number of windows: ");
        windows = scan.nextInt();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = (2*width*height) + (2*length*height) - (doors*DOOR) - (windows*WINDOW);
        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
        //Print the length, width, height, doors, and windows of the room and the
        //number of gallons of paint needed.
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Doors = " + doors);
        System.out.println("Windows = " + windows);
        System.out.println("Gallons of paint needed = " + paintNeeded);
    }
    
}
