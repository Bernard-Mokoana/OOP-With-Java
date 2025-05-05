
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Vehicle 
{
    private String owner;
    private String regNumber;
    private String make;
    private int year;
    private double price;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
       
    }
    
    public Vehicle(String owner, String regNumber,String make, int year, double price)
    {
        this.owner = owner;
        this.regNumber = regNumber;
        this.make = make;
        this.year = year;
        this.price = price;
    }
    
    public String getOwner()
    {
        return owner;
    }
    public String getRegNumber()
    {
        return regNumber;
    }
    public String getMake()
    {
        return make;
    }
    public int getYear()
    {
        return year;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
       
    
    public String toString()
    {
        String newStr = String.format("%-20s%-15s%-20s%-10d%-8.2f", owner, regNumber, make, year, price); 
        return newStr;
    }
}

    

   