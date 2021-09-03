
																																//	©	Rashedul_ISLAM
package main.books;
import main.books.authors.Author;
import main.books.publishers.Publisher;

public class Book {

    private int id;
    private String title;
    private String subTitle;
    private Author author;
    private Publisher publisher;
    private double price;

    public Book(){
    }
    
    public Book( int id ,String title, String subTitle, Author author, Publisher publisher, double price ){
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public double getPrice() {
        return this.price;
    }

}

																																//	©	Rashedul_ISLAM