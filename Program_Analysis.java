import java.util.*;
public class Program_Analysis {
	public static void main(String[] args) {
		Scanner con= new Scanner(System.in);
		System.out.print("Would you like to see the concepts or the keyterms of this topic?");
		String choice= con.nextLine();
		if(choice.equals("concepts")==true){
			keyConcepts();
		}
		else{
			keyTerms();
		}
	}
	public static void keyConcepts(){
		System.out.println("Concepts: ");
		System.out.println("~ Examining and testing programs to determine"
				+ " if they correctly meet their specifications");
		System.out.println("~ Analysis of programs or algorithms to"
				+ " understand their time and space requirements when"
				+ " applied to different data sets");
		System.out.println("~ Error identification and correction");
	}
	public static void keyTerms(){
		System.out.println("Terms:");
		System.out.println("Unit testing:   a software testing method"
				+ " by which individual units of source code");
		System.out.println("Integration testing:  a software development"
				+ " process which program units are combined and tested"
				+ " as groups in multiple ways");
		System.out.println("Debugging:  the process of locating and "
				+ "fixing or bypassing errors(bugs) in computer a "
				+ "program code or the engineering of a hardware device");
		System.out.println("Compile-time:   any type of error that "
				+ "prevent a java program compile like a syntax error, "
				+ "a class not found, a bad file name for the defined class,"
				+ " a possible loss of precision when you are mixing "
				+ "different java data types and so on");
		System.out.println("Run-time:  an error which happens, while the"
				+ " program is running");
		System.out.println("Runtime exceptions:  unchecked exceptions");
		System.out.println("Preconditions:  what must always true before"
				+ " the execution of a section of code is outputted");
		System.out.println("postconditions:  what must be true after the"
				+ " method is complete");
	}
	public Object[] subjects;
}
