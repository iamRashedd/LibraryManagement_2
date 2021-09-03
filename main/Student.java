
																																//	©	Rashedul_ISLAM
package main;

public class Student extends Patron {

    private String studentId;
    private String guardianName;
    private String guardianContactNo;

    public Student(){
    }
    public Student( int id, String name, String depart, String mail, String contact, String address, String gName, String gContact ) {
        super ( id, name, depart, mail, contact, address );
        this.studentId = ""+id;
        this.guardianName = gName;
        this.guardianContactNo = gContact;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public void setGuardianContactNo(String guardianContactNo) {
        this.guardianContactNo = guardianContactNo;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getGuardianName() {
        return this.guardianName;
    }

    public String getGuardianContactNo() {
        return this.guardianContactNo;
    }
    
   public void showInfo() {
        
        System.out.println ( "\nStudent ID: " + this.getStudentId() );
        System.out.println ( "Student Name" + super.getName() );
        System.out.println ( "Student Credit Balance: " + super.getAmount() );
        System.out.println ( "Student Department: " + super.getDepartmentName() );
        System.out.println ( "Student Email: " + super.getEmail() );
        System.out.println ( "Student Contact: " + super.getContactNo() );
        System.out.println ( "Student Address: " + super.getAddress() );
        System.out.println ( "Student Guardian Name: " + this.getGuardianName() );
        System.out.println ( "Student Guardian Contact: " + this.getGuardianContactNo() );
        if ( super.getBook() != null )
            System.out.println ( "Student Borrowed Book: " + super.getBook().getTitle() + "(" +super.getBook().getId() + ")"  );
        else
            System.out.println ( "Student Borrowed Book: Empty"  );
    }


}

																																//	©	Rashedul_ISLAM