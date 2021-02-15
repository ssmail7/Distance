//***************************************************************
//  Steven Smail
//  Distance.java
//
//  Demonstrates the use of the Math class to perform a calculation//  based on user input.
//***************************************************************
import java.util.Scanner;import java.text.DecimalFormat;
public class Distance
{
  public static void main(String[] args)
   {
    //Declaring coordinate variables
    double X1, Y1, X2, Y2;

    Scanner scan = new Scanner (System.in);

    System.out.println("This program computes the distance between two points.");
    System.out.println("Enter the X and Y coordinates of each point when prompted.");

    //Prompt for and read in for first coordinates
    System.out.print("X1: ");
    X1 = scan.nextDouble();
    System.out.print("Y1: ");
    Y1 = scan.nextDouble();

    //Prompt for and read in for second coordinates
    System.out.print("X2: ");
    X2 = scan.nextDouble();
    System.out.print("Y2: ");
    Y2 = scan.nextDouble();

    System.out.println("Computing the distance between (" + X1 + "," + Y1 + ") and ("
                       + X2 + "," + Y2 + ")");

    //Declaring distance calculation variables
    double x_distance_squared, y_distance_squared, distance_squared, distance;

    //Calculations to solve distance between coordinates
    x_distance_squared = Math.pow(X1 - X2,2);
    y_distance_squared = Math.pow(Y1 - Y2,2);
    distance_squared = x_distance_squared + y_distance_squared;
    distance = Math.sqrt(distance_squared);

    //Formatting to round the output to three decimal places.
    DecimalFormat fmt = new DecimalFormat ("0.###");

    System.out.println("The distance is " + fmt.format(distance));

    }
}