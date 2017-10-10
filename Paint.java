//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            int length;
            int width;
            int height;
            double totalSqFt;
            double paintNeeded;
            int windowSqFt;
            int doorSqFt;
            int doorNumber;
            int windowNumber;
 
            length = 15;
            width = 11;
            height = 8;
            windowSqFt = 15;            
            doorSqFt = 20;
            doorNumber = 1;
            windowNumber = 2;
            
            totalSqFt = 2 * (height * length + height * width) + length * width;
            
            totalSqFt = totalSqFt - (doorNumber * doorSqFt + windowNumber * windowSqFt);
 
            paintNeeded = totalSqFt/COVERAGE;
            
            
            paintNeeded = Math.ceil(paintNeeded);
            
            System.out.println ("Length: " + length + "\tWidth: " + width + "\tHeight: " + height);
            System.out.println ("You will need " + paintNeeded + " gallons");
        }
}