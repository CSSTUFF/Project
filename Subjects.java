import java.io.IOException;
import java.util.Scanner;
public class Subjects{
	/*asks whether the user wants to play a review game or look at "teacher made" notes*/
	public static void main(String[] args) throws IOException {
		String[] subjects={"implementation","data structures",
			"operations and algorithms","program analysis"};
		ReviewGame game=new ReviewGame();
		Scanner con= new Scanner(System.in);
		System.out.print("Would you like to look at notes or play a review game?"+
				"(type notes or review)");
		String selection=con.next();
		//goes to notes
		if(selection.toLowerCase().contains("note")==true){
			System.out.print("Which topic would you like to study? "
				+ "\nImplementation, Data Structures, "
				+ "Operations and Algorithms, or Program Analysis");
			String topic=con.next();
			chooser(topic,subjects);
		}
		//goes to game(s)
		else{
			game.multiplechoice(con);
		}
	}
	//Opens the "teacher made" notes the user chooses,
	//and to key terms or topic concepts of the topic
	public static void chooser(String selection, String[] subjects){
		Implementation implementation = new Implementation();
		Data_Structures data_structures = new Data_Structures();
		Operations_and_Algorithms operations_and_algorithms= new Operations_and_Algorithms();
		Program_Analysis program_analysis= new Program_Analysis();
		selection=selection.toLowerCase();
		Scanner con= new Scanner(System.in);
		String choice="";
		if(subjects[0].contains(selection)){
			System.out.print("Would you like to see the concepts or the key terms of this topic?");
			choice= con.nextLine().toLowerCase();
			if(choice.equals("concepts")==true){
				implementation.keyConcepts();
			}
			else{
				implementation.keyTerms();
			}
		}else if(subjects[1].contains(selection)){
			System.out.print("Would you like to see the concepts or the key terms of this topic?");
			choice= con.nextLine().toLowerCase();
			if(choice.equals("concepts")==true){
				data_structures.keyConcepts();
			}
			else{
				data_structures.keyTerms();
			}
		}else if(subjects[2].contains(selection)){
			System.out.print("Would you like to see the concepts or the key terms of this topic?");
			choice= con.nextLine().toLowerCase();
			if(choice.equals("concepts")==true){
				operations_and_algorithms.keyConcepts();
			}
			else{
				operations_and_algorithms.keyTerms();
			}
		}else if(subjects[3].contains(selection)){
			System.out.print("Would you like to see the concepts or the key terms of this topic?");
			choice= con.nextLine().toLowerCase();
			if(choice.equals("concepts")==true){
				program_analysis.keyConcepts();
			}
			else{
				program_analysis.keyTerms();
			}
		}else{
			System.out.println("Not valid");
		}
	}
}
