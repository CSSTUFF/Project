import java.util.*;
public class ClientClass extends MakeSound{
static boolean a = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw = new Draw();
		Draw.makePic();
		execute();

	}
	
	public static void execute(){
		Scanner console = new Scanner(System.in);
		if(a){
		System.out.println("Welcome to your notebook! This Class wil allow you to take notes and save them into a text document. It will timestamp your doc, and will format your bulletpoints and keywords for you"
				+ "all in all, its a pretty swell deal, all you need to do is write what you need\n");
		
		System.out.println("You will be able to open these files, as well as add to them, for example, if you were to take a notes on a subject on monday, you would be able to add to your notes any other day of"
				+ "the week.\n");
		System.out.println("This class will also create a master key terms list for you, so that you may review at any time you choose, the file will be named KEYTERMSLIST, you will be able to open it the same"
				+ "way you open any other file, to stop taking bullet notes or terms notes, type \"end doc\" and press enter\n");
		System.out.println("WARNING, if you try to create a file with the same name as a previous file, the original file will be erased\n");
		System.out.println("When adding to a notes file, you will be able to see what you previously wrote\n\n");
		System.out.println("REMEMBER, if you are bored, type \"need_inspiration\", and press enter");
		}
		a = false;
	
		System.out.println("Would you like to start a new notes file?");
		String ans = console.next();
		if(ans.toLowerCase().charAt(0)== 'y'){
			CreateModifyTxt note = new CreateModifyTxt();
			note.intro(); //will begin the process of making a new notes file	
		}
		
			System.out.println("Would you like to review or add to a notes notes file?");
			ans = console.next();
			if(ans.toLowerCase().charAt(0)== 'y'){
				NoteBook n = new NoteBook();
				n.readAdd();
			
		}
			System.out.println("Would you like do something else?");
			ans = console.next();
			 if(ans.equals("need_inspiration"))
	    		 playSound("Bob The Builder Theme Song.wav");
	    	 else{
			if(ans.toLowerCase().charAt(0)== 'y'){
				execute(); //yourself
			}
	    }
	 }
}

