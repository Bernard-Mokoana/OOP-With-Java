public class PrintBook extends Book {
    private int pages;
    private double weight;

    public PrintBook(String title, String author, String isbn, int pages, double weight) {
        super(title, author, isbn);
        this.pages = pages;
        this.weight = weight;
    }

    public int getPages() {
        return pages;
    }

    public double getWeight() {
        return weight  * 1000;
    }

    public String getSizeDetails() {
        return "Title: " + title + "Number of pages: " + pages + ", Weight: " + weight * 1000 + " kg";
    }
}
