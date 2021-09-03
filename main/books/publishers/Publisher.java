
																																//	©	Rashedul_ISLAM
package main.books.publishers;

public class Publisher {

    private int id;
    private String name;
    private String contactNo;

    
    public Publisher(){
    }
    
    public Publisher( int id, String name, String contactNo ){
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getContactNo() {
        return this.contactNo;
    }

}


																																//	©	Rashedul_ISLAM