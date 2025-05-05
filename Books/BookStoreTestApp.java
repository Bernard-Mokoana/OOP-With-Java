import java.io.*;

public class BookStoreTestApp {
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.ser"));
            while(true) {
                try{
                    Book book = (Book) in.readObject();
                    System.out.println(book.getSizeDetails());
                } catch(EOFException e) {
                    break;
                } catch(ClassNotFoundException e) {
                    System.out.println("Class not found: " + e.getMessage());
                }
            }
        } catch(IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
}
}
