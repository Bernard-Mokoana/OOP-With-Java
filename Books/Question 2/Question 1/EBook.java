public class EBook extends Book {
    private int fileSize;
 
    public EBook(String title, String author, String isbn, int fileSize) {
        super(title, author, isbn);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getSizeDetails() {
        return "EBook: " + "Title: " + title + ", FileSize: " + fileSize + "Kb";
    }
}
