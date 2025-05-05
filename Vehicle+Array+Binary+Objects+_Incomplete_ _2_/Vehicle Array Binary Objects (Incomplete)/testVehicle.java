
/**
 * Write a description of class testVehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.*;


public class testVehicle
{
   public static void main(String [] args) throws Exception
   {
     Scanner inputString = new Scanner(System.in);
     Scanner inputNumber = new Scanner(System.in);
          
     FileClass file = new FileClass();
     file.readFromFile("VehicleData.txt");
     Vehicle [] arrVehicles = file.getVehiclesArr();
     int count = file.getCount();
     
     displayList(arrVehicles, count);
     
     
    }

   public static void displayList(Vehicle [] arrVehicles, int count)
   {
     System.out.printf("%-20s%-17s%-20s%-10s%-10s\n", "Owner", "Reg Number", "Make", "Year", "Price(R.c)");
     
     for (int k = 0; k < count; k++)
     {
         System.out.println((k + 1) + "." + arrVehicles[k].toString());
     }
    }
    
    List<Vehicle> vehicles = new ArrayList<>();
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Vehicle.ser"));
      out.writeObject(vehicles);
      out.close();
    }
    catch(Exception e)
    {
      System.out.println("Error writing to file: " + e.getMessage() );
    }

    System.out.println("List: ");
    for(Vehicle vehicle : vehicles) {
      System.out.println(vehicle.writeToFile());
    }

       
  }


