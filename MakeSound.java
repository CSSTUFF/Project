import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MakeSound {

    private final static int BUFFER_SIZE = 128000;
    private static File soundFile;
    private static AudioInputStream audioStream;
    private static AudioFormat audioFormat;
    private static SourceDataLine sourceLine;

    public static void main(String [] args){
    	playSound("Bob The Builder Theme Song.wav");
    }
    
    public static void playSound(String filename){

        String Filename = filename;
            soundFile = new File(Filename);
         
        try {
            audioStream = AudioSystem.getAudioInputStream(soundFile);
        }
        catch(IOException meep){
        	// because I am only using one file that I know is in the project, there is no need for anything to be displayed here
        }
        catch(UnsupportedAudioFileException meepmeep){
        	// same stuff as above, please dont judge the names of my exceptions
        }
        audioFormat = audioStream.getFormat();

        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        try {
            sourceLine = (SourceDataLine) AudioSystem.getLine(info);
            sourceLine.open(audioFormat);
        } catch (LineUnavailableException e) {
           
        } catch (Exception e) {
     
        }

        sourceLine.start();

        int nBytesRead = 0;
        byte[] abData = new byte[BUFFER_SIZE];
      
        while (nBytesRead != -1) {
            try {
                nBytesRead = audioStream.read(abData, 0, abData.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
            
                int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
            }
        }

    
    }
}