import java.util.Scanner;


public class Subjects{
	public static void main(String[] args) {
		String[] subjects={"implementation","data structures",
			"operations and algorithms","program analysis"};
		Implementation Implementation = new Implementation();
		Data_Structures Data_Structures = new Data_Structures();
		Operations_and_Algorithms Operations_and_Algorithms= new Operations_and_Algorithms();
		Program_Analysis Program_Analysis= new Program_Analysis();
		Scanner con= new Scanner(System.in);
		System.out.print("Would you like to look at notes or play a review game?"+
				"(type notes or review)");
		String selection=con.next();
		if(selection.toLowerCase().contains("note")==true){
			System.out.print("Which topic would you like to study? "
				+ "\nImplementation, Data Structures, "
				+ "Operations and Algorithms, or Program Analysis");
			String topic=con.next();
			chooser(topic,subjects);
		}
		else{
			/**review class**/
		}
	}
	public static void chooser(String selection, String[] subjects){
		selection=selection.toLowerCase();
		for(int i=0;i<subjects.length;i++){
			if(subjects[i].contains(selection)){
				System.out.println();
			}
		}
	}
}
