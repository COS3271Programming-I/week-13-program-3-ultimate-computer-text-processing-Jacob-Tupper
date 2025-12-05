package ultimate_computer_text_processing;

//Importing the differnet Programs
import program_1_Display_APP.*; //Display_Text
import oppish_app.*; //OPPISH_APP
import program_2_Text_Art_App.*; //Text_Art_App
import encouragement_APP.*; //Encouragment_APP
import java.util.Scanner;
import java.io.PrintStream;

public class MainCaller {
	static Scanner usin = new Scanner(System.in);
	static PrintStream so = System.out;
	
	public static void main(String[] args) {
		int selection; //Created variable
		
		//Created tag to break the loop
		outerloop:
		while (true) {
			//Printing the options out
			so.print("\n1. Display Text\n2. Text Art\n3. Encouragment App\n4. Oppish App\nSelection: ");
			selection = usin.nextInt();
			
			//Switch case to select the programs
			switch(selection) {
			case(1) : {Display_Text.main(args); break;}
			case(2) : {Text_Art_App.main(args); break;}
			case(3) : {Encouragment_APP.main(args); break;}
			case(4) : {OPPISH_APP.main(args); break;}
			default : break outerloop;
			}
		}
	}
}
