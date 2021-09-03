
																																//	©	Rashedul_ISLAM
package main.books.authors;

public class Author {

    private int id;
    private String name;
    private String email;

    
    public Author (){
    }
    public Author ( int id, String name, String email ){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

}

																																//	©	Rashedul_ISLAM