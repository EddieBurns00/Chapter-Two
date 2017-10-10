import java.util.Scanner;
public class RightTriangle
{
   public static void main (String[] args)
   {
          Scanner keyboard = new Scanner(System.in);
          double side1, side2;  // lengths of the sides of a right triangle
          double hypotenuse;
          double sumOfSides;
          // length of the hypotenuse
 
          // Get the lengths of the sides as input
          System.out.println ("Please enter the length of the side of a right triangle");
        side1 = keyboard.nextDouble();
          System.out.println ("please enter the length of the side of a right triangle");
        side2 = keyboard.nextDouble();
        side1 = Math.pow(side1, 2);
        side2 = Math.pow(side2, 2);
     
        sumOfSides = (side1 + side2);
          // Compute the length of the hypotenuse
        hypotenuse = Math.sqrt(sumOfSides);
     
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
        }
   
}
 


