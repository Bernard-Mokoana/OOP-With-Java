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

      System.out.println("List of books: ");
      for(Book book: books){
         if(book instanceof EBook) {
            EBook eb = (EBook) book;
            System.out.printf("EBook: %s by %s, ISBN: %s, File Size: %d Kb%n", eb.getTitle(), eb.getAuthor(), eb.getIsbn(), eb.getFileSize());
        } if(book instanceof PrintBook) {
            PrintBook pb = (PrintBook) book;
            System.out.printf("PrintBook: %s by %s, ISBN: %s, %d pages, Weight: %.0f g%n", pb.getTitle(), pb.getAuthor(), pb.getIsbn(), pb.getPages(),
             pb.getWeight());
      }
    }

      System.out.println("\nSize of information: ");
      for(Book book: books){
        System.out.println(book.getSizeDetails());
    }

    System.out.println("\nWeight of PrintBook: ");
    for(Book book: books){
        if(book instanceof PrintBook){
            PrintBook pb = (PrintBook) book;
            System.out.printf("%s , %.0f g%n", pb.getTitle(), pb.getWeight());
 }
}
}
}