
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
public class CreateModifyTxt  extends MakeSound{

	
	/*
	This is going to be an explanation on the classes I imported from the Java.io package in order to make the Notes Class.
	For clarification, this class is meant to create a new text file, or overwrite an existing file.
	The classes and exceptions used from are mainly taken from the java.io class.
	The main line that utilizes these classes and enables the user to write on a text doc is:
	Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + ".txt"), StandardCharsets.UTF_8)
	to explain how this is used, I will work backwards
	StandardCharsets is essentially like the language for the the text file, as the text file does not accept the output used on the java console
	FileOutputStream is the path to the file, can be described as the bridge to the new file
	OutputStreamWriter is like the road the text follows to get to the text file
	BufferedWriter is a bit different, it is like the translator. It essentially translates from java output, to the StandardCharsets
	Writer class is the final step to executing the writing of a single line of text into the txt file.
	
	the try/catch function is used in this class in order to prevent the user
	*/
	
	
	public static void intro() { 
		System.out.println("What do you want to name your File Name to be?");
		String name = inputWord();
		File file = new File(name);
		if(file.exists()){
			System.out.println("A File with that name already exists, please choose a different name");
			intro();
		}
			
		ArrayList<String> empty= new ArrayList<String>();
		addToDoc(name, empty);
	
}
	public static void addToDoc(String name, List<String> lines){
		Date d = new Date();
		List<String> bulletnotes = new ArrayList<String>();
		List<KeyTermsOBJ> terms = new ArrayList<KeyTermsOBJ>();
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + ".txt"), StandardCharsets.UTF_8))) {
			for(String a : lines){
				writer.write(a + "\n");
			}
			writer.write((d.getMonth() +1 )  + "/" + d.getDate() + "/" + (d.getYear()%100)  + "\n");
			System.out.println("Would you like to add a subheading(Topic)");
			String a = inputWord();
			boolean check =  (a.toLowerCase().charAt(0)=='y');
			if(check){
			System.out.println("Topic?");
			String topic = inputWord();
			writer.write("\t\t\t\t" + topic);
			}
		    System.out.println("begin writing bullet points, press enter to start a new bullet");
		    String bullet = inputWords();
		    writer.write("\n");
		    while(!bullet.equals("end doc")){
		    	 bullet = inputWords();
		    	 if(bullet.equals("need_inspiration"))
		    		 playSound("Bob The Builder Theme Song.wav");
		    	 else{
		    	 if(!bullet.equals("end doc")){
		    		 writer.write("-" + bullet + "\n");
		    		 bulletnotes.add("-" + bullet);
		    	 }
		    	 }
		    	
		    }
		 System.out.println("Key Terms?(yes or no)");
		 String ans = inputWord();
		 String term = "";
		 if(ans.toLowerCase().charAt(0)=='y'){
			 writer.write("\t\t\t\tkeyterms");
			  while(!term.equals("end doc")){
				  	 System.out.println("term?");
			    	 term = inputWords();
			    	 if(bullet.equals("need_inspiration"))
			    		 playSound("Bob The Builder Theme Song.wav");
			    	 else{
			    	 if(!term.equals("end doc")){
			    	 System.out.println("definition?");
			    	 String def = inputWords();
			    	 KeyTermsOBJ k = new KeyTermsOBJ(term, def);
			    	 terms.add(k);
			    	}
			    }
			 } 
			  writer.write("\n");
			  for(KeyTermsOBJ k: terms){
				  writer.write(k.getTerm() + " --> " + k.getDef() + "\n");
			  }
		 }
		 
		} 
		catch (IOException ex) {
		   
		} 

	}
	public static String inputWord(){
		Scanner console = new Scanner(System.in);
		String a = console.next();
		return a;
	}
	public static String inputWords(){
		Scanner console = new Scanner(System.in);
		return console.nextLine();
	}
}
