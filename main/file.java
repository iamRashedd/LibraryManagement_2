
																																//	©	Rashedul_ISLAM
package main;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import main.books.Book;

public class file{
	
	private static String path = System.getProperty ( "user.dir" ) + "/data/";
	
	public static void saveTeacher ( Teacher t ){
		try{
			String id = t.getTeacherId();
			File mainFile = new File ( path +"Teacher-"+ id + ".txt" );
			
			if( !mainFile.exists() )
				mainFile.createNewFile();
				
			FileWriter file = new FileWriter( mainFile );
			
				file.write ( "Teacher Name: " + t.getName() + "\n" );
				file.write ( "Teacher ID  : " + t.getTeacherId() + "\n" );
				file.write ( "Teacher Department: " + t.getDepartmentName() + "\n" );
				file.write ( "Teacher Email    : " + t.getEmail() + "\n" );
				file.write ( "Teacher Contact: " + t.getContactNo() + "\n" );
				file.write ( "Teacher  Address: " + t.getAddress() + "\n" );
				file.write ( "\n" );
				file.close();
			
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
	
	public static void saveStudent ( Student s ){
		try{
			String id = s.getStudentId();
			File mainFile = new File ( path +"Student-"+ id + ".txt" );
			
			if( !mainFile.exists() )
				mainFile.createNewFile();
				
			FileWriter file = new FileWriter( mainFile );
			
				file.write ( "Student Name: " + s.getName() + "\n" );
				file.write ( "Student ID  : " + s.getStudentId() + "\n" );
				file.write ( "Student Department: " + s.getDepartmentName() + "\n" );
				file.write ( "Student Email    : " + s.getEmail() + "\n" );
				file.write ( "Student Contact: " + s.getContactNo() + "\n" );
				file.write ( "Student  Address: " + s.getAddress() + "\n" );
				file.write ( "Student Contact: " + s.getGuardianName() + "\n" );
				file.write ( "Student  Address: " + s.getGuardianContactNo() + "\n" );
				file.write ( "\n" );
				file.close();
			
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
	}
	public static void saveBook ( Book b){
		try{
			String id = "" + b.getId();
			File mainFile = new File ( path +"Book-"+ id + ".txt" );
			
			if( !mainFile.exists() )
				mainFile.createNewFile();
				
			FileWriter file = new FileWriter( mainFile );
			
				file.write ( "Book Title: " + b.getTitle() + "\n" );
				file.write ( "Book ID  : " + b.getId() + "\n" );
				file.write ( "Book SubTitle: " + b.getSubTitle() + "\n" );
				file.write ( "Book Author ID : " + b.getAuthor().getId() + "\n" );
				file.write ( "Book Author Name : " + b.getAuthor().getName() + "\n" );
				file.write ( "Book Author Email : " + b.getAuthor().getEmail() + "\n" );
				file.write ( "Book Publisher ID: " + b.getPublisher().getId() + "\n" );
				file.write ( "Book Publisher Name: " + b.getPublisher().getName() + "\n" );
				file.write ( "Book Publisher Contact: " + b.getPublisher().getContactNo() + "\n" );
				file.write ( "Book  Price: " + b.getPrice() + "\n" );
				file.write ( "\n" );
				file.close();
			
		}
		catch ( IOException e ){
			System.out.println ( "An error occured" );
			e.printStackTrace();
		}
		
	}
	
	
	public static void showDetails ( ){
		
	}
}

																																//	©	Rashedul_ISLAM