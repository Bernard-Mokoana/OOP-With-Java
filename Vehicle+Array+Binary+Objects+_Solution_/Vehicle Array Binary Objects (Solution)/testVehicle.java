
/**
 * Write a description of class testVehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;

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
     
     writeObjectsToFile(arrVehicles, count);
     System.out.println("\nData from object file");
     readObjectsFromFile(count);
     
     
     
    }

   public static void displayList(Vehicle [] arrVehicles, int count)
   {
     System.out.printf("%-20s%-17s%-20s%-10s%-10s\n", "Owner", "Reg Number", "Make", "Year", "Price(R.c)");
     
     for (int k = 0; k < count; k++)
     {
         System.out.println((k + 1) + "." + arrVehicles[k].toString());
     }
    }
    
    public static void writeObjectsToFile(Vehicle [] arrVehicles, int count) throws IOException
    {
    //Serializing objects to file vehicles.ser
     // try
     // {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicles.ser"));
        for(int k = 0; k < count;k++)
        {
            out.writeObject(arrVehicles[k]);
        }
            
        out.close();
      //}
      //catch(IOException ex)
      //{
      //  System.out.println(ex);
     // }
    }
    
   public static void readObjectsFromFile(int count) throws Exception
    {
    //Deserializing objects when reading from file vehicles.ser
        boolean endOfFile = false;
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("vehicles.ser"));
        while (!(endOfFile))        
        {
            try
            {
              Vehicle vehicle = (Vehicle)file.readObject();
              System.out.println(vehicle.getOwner());
            }
            catch (EOFException e)
            {
                endOfFile = true;
            }
        }
            
        file.close();
      }
     
    
   
       
}
