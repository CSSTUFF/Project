
import java.util.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
public class CreateModifyTxt{

	public static void main(String[] args) { 
		Date d = new Date();
		List<String> bulletnotes = new ArrayList<String>();
		List<KeyTermsOBJ> terms = new ArrayList<KeyTermsOBJ>();
		System.out.println("File Name?");
		String name = inputword();
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + ".txt"), StandardCharsets.UTF_8))) {
			writer.write((d.getMonth() +1 )  + "/" + d.getDate() + "/" + (d.getYear()%100)  + "\n");
			System.out.println("Topic?");
			String topic = inputword();
		    writer.write("\t\t\t\t" + topic);
		    System.out.println("begin writing bullet points, press enter to start a new bullet");
		    String bullet = inputWords();
		    writer.write("\n");
		    while(!bullet.equals("end doc")){
		    	 bullet = inputWords();
		    	 if(!bullet.equals("end doc")){
		    		 writer.write("-" + bullet + "\n");
		    		 bulletnotes.add("-" + bullet);
		    	 }
		    	
		    }
		 System.out.println("Key Terms?(yes or no)");
		 String ans = inputword();
		 String term = "";
		 if(ans.toLowerCase().charAt(0)=='y'){
			 writer.write("\t\t\t\tkeyterms");
			  while(!term.equals("end doc")){
				  	 System.out.println("term?");
			    	 term = inputWords();
			    	 if(!term.equals("end doc")){
			    	 System.out.println("definition?");
			    	 String def = inputWords();
			    	 KeyTermsOBJ k = new KeyTermsOBJ(term, def);
			    	 terms.add(k);
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
	public static String inputword(){
		Scanner console = new Scanner(System.in);
		String a = console.next();
		return a;
	}
	public static String inputWords(){
		Scanner console = new Scanner(System.in);
		return console.nextLine();
	}
}
