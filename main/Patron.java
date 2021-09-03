
																																//	©	Rashedul_ISLAM
package main;
import main.books.Book;

public abstract class Patron{

    private int id;
    private String name;
    private String departmentName;
    private String email;
    private String contactNo;
    private String address;
    private double amount;
    private Book book;

    public Patron(){
    }
    
    public Patron( int id, String name, String depart, String mail, String contact, String address ){
        this.id = id;
        this.name = name;
        this.departmentName = depart;
        this.email = mail;
        this.contactNo = contact;
        this.address = address;
    }
    public void setId ( int id ) {
        this.id = id;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setDepartmentName ( String departmentName ) {
        this.departmentName = departmentName;
    }
 
    public void setEmail ( String email ) {
        this.email = email;
    }

    public void setContactNo ( String contactNo ) {
        this.contactNo = contactNo;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public void setAmount ( double amount ) {
        this.amount = amount;
    }
    
    public void setBook ( Book b ){
        this.book = b;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public String getAddress() {
        return this.address;
    }

    public double getAmount() {
        return this.amount;
    }
    public Book getBook(){
        return book;
    }

    abstract public void showInfo();

}

																																//	©	Rashedul_ISLAM