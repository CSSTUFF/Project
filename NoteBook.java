import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class NoteBook { //extend to Implementation, Data_Structures, Operations_and_Algorithms

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		List<KeyTermsOBJ> terms = new ArrayList<KeyTermsOBJ>();
		System.out.println("please enter the file name of the notes you would like to open(DO NOT INCLUDE .txt)");
		String name = console.next();
		BufferedReader reader = new BufferedReader(new FileReader(name + ".txt"));
		  Scanner file = new Scanner(reader);
		  while(file.hasNext()){
			  String line = file.nextLine();
			  System.out.println(line);
			  if(line.contains("-->")){
			KeyTermsOBJ k = new KeyTermsOBJ(line.substring(0, line.indexOf("-->")-1), line.substring(line.indexOf(">")+2));
			terms.add(k);
			  }
		  }

	}

}
