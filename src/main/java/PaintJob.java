
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class PaintJob {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      // enter number of rooms
      System.out.println("Enter the number of rooms to be painted please");
      double roomNumber = keyboard.nextDouble();
      //get sq ft total for each room
      double totalSqFootage = getSqFtForEachRoom(roomNumber);
      
      //calculate number of gallons reqiured
      System.out.println("Please enter price of a gallon of paint");
      double pricePerGal = keyboard.nextDouble();
      double totalGallonsOfPaintNeeded = gallonsOfPaint(totalSqFootage);
      System.out.println("The total gallons of paint needed is " +totalGallonsOfPaintNeeded );
      //calculate labor hours required
double totalLaborHours = laborCalculation( totalSqFootage);
      System.out.println("Total labor hours are " + totalLaborHours);
      //calculate cost of paint
      double totalPaintCost = paintCost( pricePerGal,  totalGallonsOfPaintNeeded);
      System.out.println("The total cost of paint is $" + totalPaintCost);
      //calculate labor charges
  double totalLaborCharges = laborCharges( totalLaborHours );
  System.out.println("The total labor charges are $" + totalLaborCharges);
      //total cost of the paint job
  double totalCost = totalCost( totalPaintCost, totalLaborCharges );
  System.out.println("The total cost of the job is $" + totalCost);
    }
    public static double getSqFtForEachRoom(double roomNumber){
            double totalSqFootage = 0.0;
              Scanner keyboard = new Scanner(System.in);
             for(int i = 1; i < (roomNumber + 1); ++i){
            System.out.println("Enter Sqaure footage of room number " + i);
            double sqFtForOneRoom = keyboard.nextDouble();
           totalSqFootage = totalSqFootage + sqFtForOneRoom;
           
            
        }
        return totalSqFootage;
    }
    public static double gallonsOfPaint( double totalSqFootage){
        double gallonsOfPaintNeeded = (totalSqFootage * (1.0/115.0));
        return gallonsOfPaintNeeded;
    }
    public static double laborCalculation(double totalSqFootage){
        double laborNeeded = (totalSqFootage * (8.0/115.0));
        return laborNeeded;
    }
    public static double laborCharges(double totalLaborHours ){
        double laborCharges = totalLaborHours * 18.00;
        return laborCharges;
    }
    public static double paintCost( double pricePerGal, double totalGallonsOfPaintNeeded){
        double paintCost = pricePerGal * totalGallonsOfPaintNeeded;
        return paintCost;
    }
    public static double totalCost( double totalPaintCost, double totalLaborCharges ){
        double totalCost =    totalPaintCost + totalLaborCharges;
        return totalCost;

    }
    
}
