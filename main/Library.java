
																																//	©	Rashedul_ISLAM
package main;
import interfaces.BookOperations;
import interfaces.StudentOperations;
import interfaces.TeacherOperations;
import interfaces.IBasicOperations;
import main.books.Book;
import main.*;

public class Library implements BookOperations, StudentOperations, TeacherOperations, IBasicOperations{
   
	
	private static Book books[] = new Book[10];
	public static Teacher teachers[] = new Teacher[10];
	public static Student students[] = new Student[10];
	
	public void insertTeacher ( Teacher t ){
		boolean flag = true;
		for ( int i=0; i<teachers.length; i++ ){
			
			if ( teachers[i] == null ){
				teachers[i] = t;
				flag = false;
				System.out.println ( "\nTeacher inserted successfully" );
				file.saveTeacher ( t );
				System.out.println ( "Teacher File saved" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to insert teacher" );
	}
	
	public void removeTeacher ( Teacher t ){
		boolean flag = true;
		for ( int i=0; i<teachers.length; i++ ){
			
			if ( teachers[i] == t ){
				teachers[i] = null;
				flag = false;
				System.out.println ( "\nTeacher removed successfully" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to remove teacher" );
	}
    public Teacher getTeacher ( String teacherId ){
		boolean notFound = true;
		for ( int i=0; i<teachers.length; i++ ){
			
			if ( teachers[i].getTeacherId().compareTo ( teacherId ) == 0 ){
				notFound = false;
				System.out.println ( "\nTeacher found" );
				return teachers[i];
			}
		}
		if ( notFound ) 
			System.out.println ( "\nTeacher not found" );
		
		return null;
	}
	public void showAllTeachers(){
		boolean isEmpty = true;
		System.out.println ( "\nShowing all teachers......\n" );
		for ( int i=0; i<teachers.length; i++ ){
			
			if ( teachers[i] != null ){
				teachers[i].showInfo();
				isEmpty = false;
			}
		}
		if ( isEmpty ) 
			System.out.println ( "\nNo teachers to show" );
		
	}
	
	public void insertStudent(Student s){
		boolean flag = true;
		for ( int i=0; i<students.length; i++ ){
			
			if ( students[i] == null ){
				students[i] = s;
				flag = false;
				System.out.println ( "\nStudent inserted successfully" );
				file.saveStudent ( s );
				System.out.println ( "Student File saved" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to insert student" );
	}
	public void removeStudent(Student s){
		boolean flag = true;
		for ( int i=0; i<students.length; i++ ){
			
			if ( students[i] == s ){
				students[i] = null;
				flag = false;
				System.out.println ( "\nStudent removed successfully" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to remove student" );
	}
    public Student getStudent( String studentId ){
		boolean notFound = true;
		for ( int i=0; i<students.length; i++ ){
			
			if ( students[i] !=null && students[i].getStudentId().compareTo ( studentId ) == 0 ){
				notFound = false;
				System.out.println ( "\nStudent found" );
				return students[i];
			}
		}
		if ( notFound ) 
			System.out.println ( "\nStudent not found" );
		
		return null;
	}
	public void showAllStudents( ){
		boolean isEmpty = true;
		System.out.println ( "\nShowing all students......\n" );
		for ( int i=0; i<students.length; i++ ){
			
			if ( students[i] != null ){
				students[i].showInfo();
				isEmpty = false;
			}
		}
		if ( isEmpty ) 
			System.out.println ( "\nNo students to show" );
	}

	public void insertBook( Book b ){
		boolean flag = true;
		for ( int i=0; i<books.length; i++ ){
			
			if ( books[i] == null ){
				books[i] = b;
				flag = false;
				System.out.println ( "\nBook inserted successfully" );
				file.saveBook ( b );
				System.out.println ( "Book File saved" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to insert Book" );
    }
	public void removeBook( Book b ){
		boolean flag = true;
		for ( int i=0; i<books.length; i++ ){
			
			if ( books[i] == b ){
				books[i] = null;
				flag = false;
				System.out.println ( "\nBook removed successfully" );
				break;
			}
		}
		if ( flag ) 
			System.out.println ( "\nUnable to remove Book" );
	}
    public Book getBook( int BookId ){
		boolean notFound = true;
		for ( int i=0; i<books.length; i++ ){
			
			if ( books[i] !=null && books[i].getId() == BookId ){
				notFound = false;
				System.out.println ( "\nBook found" );
				return books[i];
			}
		}
		if ( notFound ) 
			System.out.println ( "\nBook not found" );
		
		return null;
    }
    public void showAllBooks(){
		boolean isEmpty = true;
		System.out.println ( "\nShowing all books......\n" );
		for ( int i=0; i<books.length; i++ ){
			
			if ( books[i] != null ){
				System.out.println ( "\nBook id: " + books[i].getId() );
				System.out.println ( "Book title: " + books[i].getTitle() );
				System.out.println ( "Book author name: " + books[i].getAuthor().getName() );
				System.out.println ( "Book publisher name: " + books[i].getPublisher().getName() );
				System.out.println ( "Book Price : " + books[i].getPrice() );
				isEmpty = false;
			}
		}
		if ( isEmpty ) 
			System.out.println ( "\nNo books to show" );
    }
	public void borrowBook ( Patron p , Book b ){
			
			if ( p.getBook() == null ){
				p.setBook( b );
				System.out.println ( "\nBook borrowed successfully" );
			}
			else
				System.out.println ( "\nThe Patron has already borrowed a book" );
	}
	public void returnBook ( Patron p , Book b ){
		
		if( p.getBook() == b ){
			p.setBook ( null );
			System.out.println ( "\nBook returned successfully" );
		}
		else
			System.out.println ( "\nThe Patron does not have this Book" );
	}
	public void fine ( Patron p, double amount ){
		
		double balance = p.getAmount();
		balance += amount;
		p.setAmount ( balance );
		System.out.println ( "The Patron has been fined" );
	}
	
}

																																//	©	Rashedul_ISLAM