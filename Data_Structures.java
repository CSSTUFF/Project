import java.util.*;
public class Data_Structures {
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
		System.out.println("~ Used to represent information within a program");
		System.out.println("~ Abstraction");
	}
	public static void keyTerms(){
		System.out.println("Terms:");
		System.out.println("~ Primitive data types:  int, boolean, double");
		System.out.println("~ Strings:  ");
		System.out.println("~ Classes:  a blueprint or a template for making"
				+ " different objects which defines its properties and behaviors."
				+ " They can have feilds and methods to describe the behavior"
				+ " of an object");
		System.out.println("~ Lists:  a sequence of elements, where the user has"
				+ " control over where each element is inserted in the list and "
				+ "can access then by their indexes");
		System.out.println("~ Arrays(1-dimensional):  a list of like-typed variables");
		System.out.println("~ Arrays(2-dimensional):  they are stored as"
				+ " an array of arrays, and can be used as a spread sheet");
	}
	public Object[] subjects;
}
