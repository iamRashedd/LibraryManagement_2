
																																//	©	Rashedul_ISLAM
package main;

public class Teacher extends Patron{

    private String teacherId;

     public Teacher(){
    }
    public Teacher ( int id, String name, String depart, String mail, String contact, String address ) {
        super (  id, name, depart, mail, contact, address );
        this.teacherId = ""+id;
    }
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return this.teacherId;
    }
    
    public void showInfo() {
        System.out.println ( "\nTeacher ID: " + this.getTeacherId() );
        System.out.println ( "Teacher Name" + super.getName() );
        System.out.println ( "Teacher Credit Balance: " + super.getAmount() );
        System.out.println ( "Teacher Department: " + super.getDepartmentName() );
        System.out.println ( "Teacher Email: " + super.getEmail() );
        System.out.println ( "Teacher Contact: " + super.getContactNo() );
        System.out.println ( "Teacher Address: " + super.getAddress() );
        if ( super.getBook() != null )
            System.out.println ( "Teacher Borrowed Book: " + super.getBook().getTitle() + "(" +super.getBook().getId() + ")"  );
        else
             System.out.println ( "Teacher Borrowed Book: Empty" );
        
    }
}

																																//	©	Rashedul_ISLAM