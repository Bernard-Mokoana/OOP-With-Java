import java.util.*;
import java.io.*;

public class BookStoreApp {
 public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    try{ 
        Scanner scanner = new Scanner(new File("books.txt"));
        while(scanner.hasNextLine()){
            String[] data = scanner.nextLine().split("#");
         if(data[2].charAt(0) == '0') {
            books.add(new PrintBook(data[0], data[1], data[2], Integer.parseInt(data[3]), Double.parseDouble(data[4])));
         }else if(data[2].charAt(-0) == '1') {
            books.add(new EBook(data[0], data[1], data[2], Integer.parseInt(data[3])));
         }
     }
    }
    catch(FileNotFoundException e) {
        System.err.println("File not found" + e.getMessage());
        System.exit(1);
      }

    /*   Collections.sort(books, new Comparator<Book>() {
        public int compare(Book b1, Book b2) {
            return b1.getTitle().compareTo(b2.getTitle());
        }
      }); */

      try{
        ObjectOutputStream out = new  ObjectOutputStream(new FileOutputStream("books.ser"));
        out.writeObject(books);
        out.close();
      } catch(IOException e) {
        System.err.println("Error writing to file: " + e.getMessage());
      }

      System.out.println("Size information of books: ");
      for(Book book: books) {
        System.out.println(book.getSizeDetails());
      }
    }
}