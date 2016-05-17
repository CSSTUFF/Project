import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


import javax.sound.sampled.AudioInputStream;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel = new DrawingPanel(800,800);
		Graphics g = panel.getGraphics();
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 800, 800);
			g.setColor(Color.BLACK);
		  Font myFont = new Font("Times", Font.BOLD, 40);
		  g.setFont(myFont);
		  g.drawString("Welcome to Your NoteBook", 105, 380);
		  
		 

		
	}

}
