public class FileClass {
    private Vehicle[] vehiclesArr;
    private int count;

    public void readFromFile(String filename) {
        vehiclesArr = new Vehicle[3];
        vehiclesArr[0] = new Vehicle("John Doe", "ABC123", "Toyota", 2020, 25000.0);
        vehiclesArr[1] = new Vehicle("Jane Smith", "XYZ789", "Honda", 2018, 20000.0);
        vehiclesArr[2] = new Vehicle("Alice Johnson", "DEF456", "Ford", 2019, 30000.0);
        count = 3; 
    }

    public Vehicle[] getVehiclesArr() {
        return vehiclesArr;
    }

    public int getCount() {
        return count;
    }
}