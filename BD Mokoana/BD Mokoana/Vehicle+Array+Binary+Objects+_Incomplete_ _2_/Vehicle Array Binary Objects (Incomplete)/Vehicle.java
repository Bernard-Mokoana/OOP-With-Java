                                                                                                                    
/**
 * 
 * @author (BD MOKOANA 39156117) 
 * @version (VERSION)
 */


import java.io.Serializable;

public class Vehicle implements Serializable {
    private String owner;
    private String regNumber;
    private String make;
    private int year;
    private double price;

    public Vehicle(String owner, String regNumber, String make, int year, double price) {
        this.owner = owner;
        this.regNumber = regNumber;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-17s%-20s%-10d%-10.2f", owner, regNumber, make, year, price);
    }
}
