
/**
 * Write a description of class FileClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileClass
{
    private Vehicle [] arrVehicles = new Vehicle[20];
    private int count = 0;
    
    public void readFromFile(String fileName)
   {
    try
        {
            Scanner sc = new Scanner(new FileReader(fileName));

            while (sc.hasNext())
            {
              String [] info = sc.nextLine().split(",");

              String owner = info[0];
              String regNum = info[1];
              String make = info[2];
              int year = Integer.parseInt(info[3]);
              double price = Double.parseDouble(info[4]);                 
              arrVehicles[count] = new Vehicle(owner, regNum, make, year, price);
              count++;
            }
                
            sc.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error using the file");
        }
    }
    
    public int getCount()
    {
        return count;
    }
        
    public Vehicle [] getVehiclesArr()
    {
        return arrVehicles;
    }
    
    public void writeToFile() //throws IOException
    {
        try
        {
        PrintWriter fileWrite = new PrintWriter(new FileWriter("NewData.txt"));
        for (int k = 0; k < count; k++)
           {
             fileWrite.println(arrVehicles[k].getOwner()+ "@" + arrVehicles[k].getPrice() );
        }
        fileWrite.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error creating the file");
        }
    
    }
}
