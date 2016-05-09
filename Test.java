

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
public class Test{

	public static void main(String[] args) {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myFile.txt"), StandardCharsets.UTF_8))) {
		    writer.write("text to write");
		} catch (IOException ex) {
		    // handle me
		}  
}
}