import java.util.*;
public class SubjectsRunner {

	public static void main(String[] args) {
		Scanner con= new Scanner(System.in);
		System.out.print("Would you like to look at notes or play a review game?"+
				"(type notes or review)");
		String selection=con.next();
		Subjects nvsr= new Subjects(selection);
		
	}

}
