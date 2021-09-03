
																																//	©	Rashedul_ISLAM
package menu;

import interfaces.BookOperations;
import main.books.Book;
import main.books.publishers.Publisher;
import main.books.authors.Author;
import main.Library;
import java.util.Scanner;
import java.util.InputMismatchException;

class bookManagement{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	BookOperations b = new Library();
	
	public bookManagement(){
		
		do{
			menu.bookMenu();
			option = scan.nextByte();
			scan.skip ( "\\R" );
			System.out.println ();
			
			switch( option ){
				
				case 1:
					b.insertBook( newBook() );
					break;
				
				case 2:
					System.out.print ( "\n>>Enter Book id to search: " );
					int id = scan.nextInt();
					Book temp = b.getBook ( id );
					if ( temp != null ){
						System.out.println ( "Book found" );
						showDetails ( temp );
					}
					else
						System.out.println ( "Book not Found" );
					break;
				
				case 3:
					b.showAllBooks();
					break;
				
				case 4:
					break;
				
				default:
					System.out.println ( "##INVALID INPUT" );
			}
		}while( option!=4 );
	}
	
	private Book newBook (){
		
			System.out.print ( "Enter Book ID: " );
			int id = scan.nextInt();
			scan.skip ( "\\R");
			System.out.print ( "Enter Book Tittle: " );
			String tittle = scan.nextLine().trim();
			System.out.print ( "Enter Book SubTittle: " );
			String subTittle = scan.nextLine().trim();
			System.out.print ( "Enter Book Author ID: " );
			int authorId = scan.nextInt();
			scan.skip ( "\\R");
			System.out.print ( "Enter Book Author Name: " );
			String authorName = scan.nextLine().trim();
			System.out.print ( "Enter Book Author Email: " );
			String authorEmail = scan.nextLine().trim();
			System.out.print ( "Enter Book Publisher ID: " );
			int publisherId = scan.nextInt();
			scan.skip ( "\\R");
			System.out.print ( "Enter Book Publisher Name: " );
			String publisherName = scan.nextLine().trim();
			System.out.print ( "Enter Book Publisher Contact: " );
			String publisherContact = scan.nextLine().trim();
			System.out.print ( "Enter Book Price: " );
			double price = scan.nextDouble();
			
			
			
			Author a = new Author ( authorId, authorName, authorEmail );
			Publisher p = new Publisher ( publisherId, publisherName, publisherContact );
			Book bk = new Book( id, tittle, subTittle, a, p, price );
			return bk;
	}
	private void showDetails ( Book bk ){
		System.out.println ( "Book Title: " + bk.getTitle() );
		System.out.println ( "Book ID  : " + bk.getId() );
		System.out.println ( "Book SubTitle: " + bk.getSubTitle() );
		System.out.println ( "Book  Author Name : " + bk.getAuthor().getName() );
		System.out.println ( "Book Publisher Name: " + bk.getPublisher().getName() );
		System.out.println ( "Book  Price: " + bk.getPrice() );
	}		
	
}

																																//	©	Rashedul_ISLAM