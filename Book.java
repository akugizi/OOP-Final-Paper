
public class Book {
    private String title;
    private String author;
    private String publisher;
    private String city;
    private String dateOfPublication;
    private double price;
    private ISBN isbnNum;

    public Book(String title, String author, String publisher, String city, 
      String dateOfPublication, double price, ISBN isbnNum) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.isbnNum = isbnNum;
    }

    public void setBookISBN(ISBN isbnNum) {
        this.isbnNum = isbnNum;
    }

    public String getAuthor() {
        return author;
    }

    public ISBN getBookISBN() {
        return isbnNum;
    }

    public void printDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + isbnNum.getISBN());
    
}

    private static class ISBN {

        public ISBN() {
        }

        private String getISBN() {
            throw new UnsupportedOperationException("Not supported yet."); 

        }
    }}
