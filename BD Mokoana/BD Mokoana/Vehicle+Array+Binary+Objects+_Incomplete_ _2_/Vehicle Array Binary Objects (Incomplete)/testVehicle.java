                                                                                                                    
/**
 * 
 * @author (BD MOKOANA 39156117) 
 * @version (VERSION)
 */


import java.io.*;
import java.util.Scanner;

public class testVehicle {

    public static void main(String[] args) throws Exception {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);

        FileClass file = new FileClass();
        file.readFromFile("VehicleData.txt");
        Vehicle[] arrVehicles = file.getVehiclesArr();
        int count = file.getCount();

        displayList(arrVehicles, count);

        saveObjects(arrVehicles, count, "vehicles.ser"); 
        
        readObjects("vehicles.ser"); 
    }

    public static void displayList(Vehicle[] arrVehicles, int count) {
        System.out.printf("%-20s%-17s%-20s%-10s%-10s\n", "Owner", "Reg Number", "Make", "Year", "Price(R.c)");

        for (int k = 0; k < count; k++) {
            System.out.println((k + 1) + "." + arrVehicles[k].toString());
        }
    }

    public static void saveObjects(Vehicle[] arrVehicles, int count, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            System.out.println("\nSaving vehicles to " + filename + "...\n");

  
            for (int i = 0; i < count; i++) {
                objectOutputStream.writeObject(arrVehicles[i]);
            }

            System.out.println("Vehicles saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving vehicles: " + e.getMessage());
        }
    }

    public static void readObjects(String filename) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
            System.out.println("\nReading objects from " + filename + "...\n");

            int count = 0;
            while (true) {
                try {
                   
                    Vehicle vehicle = (Vehicle) objectInputStream.readObject();

             
                    System.out.println(vehicle.toString());
                    count++;
                } catch (ClassNotFoundException e) {
                    System.out.println("Error: Class not found when reading object from file.");
                    break; 
                } catch (EOFException e) {
                    System.out.println("End of file reached. Total objects read: " + count);
                    break; 
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
