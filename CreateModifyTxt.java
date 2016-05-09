
import java.util.*;
import java.io.PrintWriter;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
public class CreateModifyTxt{

	public static void main(String[] args) throws IOException {
		
		System.out.println("File Name?");
		String name = inputword();
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name + ".txt"), StandardCharsets.UTF_8))) {
			System.out.println("Topic?");
			String topic = inputword();
		    writer.write("${bold}" + topic + "${normal}");
		    System.out.println("begin writing bullet points, press enter to start a new bullet");
		    String bullet = inputWords();
		    writer.write("\n");
		    while(!bullet.equals("end doc")){
		    	 bullet = inputWords();
		    	 if(!bullet.equals("end doc"))
		    	 writer.write("-" + bullet + "\n");
		    }
		} catch (IOException ex) {
		    // handle me
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
