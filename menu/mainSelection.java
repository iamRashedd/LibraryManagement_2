
																																//	©	Rashedul_ISLAM
package menu;
import java.util.Scanner;
import java.util.InputMismatchException;

public class mainSelection{
	
	private byte option;
	Scanner scan = new Scanner ( System.in );
	
	public mainSelection(){
		
		do{
			try{
				menu.mainMenu();
				option = scan.nextByte();
				scan.skip("\\R");
				System.out.println ();
				
				switch( option ){
					
					case 1:
						new studentManagement();
						break;
					
					case 2:
						new teacherManagement();
						break;
					
					case 3:
						new bookManagement();
						break;
					
					case 4:
						new borrowManagement();
						break;
					
					case 5:
						break;
					
					default:
						System.out.println ( "##INVALID INPUT" );
				}
			}
			catch(InputMismatchException e){
				System.out.println("\n##Input mismatched\n");
				e.printStackTrace();
				scan = new Scanner(System.in);
			}
		}while( option!=5 );
	}
}


																																//	©	Rashedul_ISLAM