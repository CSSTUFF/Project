import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class NoteBook extends CreateModifyTxt { 
		// TODO Auto-generated method stub
		public static void main(String [] args){
		 readAdd();
		}
		public static void  readAdd(){
		Scanner console = new Scanner(System.in);
		List<String> original = new ArrayList<String>();
		List<KeyTermsOBJ> terms = new ArrayList<KeyTermsOBJ>();
		try{
		File dir = new File("TERM 4 PROJECT");
		System.out.println("please enter the file name of the notes you would like to open(DO NOT INCLUDE .txt)");
		String name = console.next();
		BufferedReader reader = new BufferedReader(new FileReader(name + ".txt"));
		  Scanner file = new Scanner(reader);
		  while(file.hasNext()){
			  String line = file.nextLine();
			  System.out.println(line);
			  original.add(line);
			  if(line.contains("-->")){
			KeyTermsOBJ k = new KeyTermsOBJ(line.substring(0, line.indexOf("-->")-1), line.substring(line.indexOf(">")+2));
			terms.add(k);
			  }
		  }
		  System.out.println("Would you like to add to this doc?");
			  if(inputWord().toLowerCase().charAt(0)=='y'){
				  addToDoc(name, original);
			  }

	}
		catch(FileNotFoundException ex){
			System.out.println("There are no files under that name");
			readAdd();
		}
	

}
}
