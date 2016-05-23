import java.io.*;
import java.util.*;
class ReviewGame {
	public static void main(String[] args){
		getQuizTerms();
	}
public static void getQuizTerms(){
		System.out.println("please enter the file name of the notes you would like to test yourself on(DO NOT INCLUDE .txt)");
		Scanner console = new Scanner (System.in);
		ArrayList<KeyTermsOBJ> terms = new ArrayList<KeyTermsOBJ>();
		String name = console.next();
		try{
		BufferedReader reader = new BufferedReader(new FileReader(name + ".txt"));
		  Scanner file = new Scanner(reader);
		  while(file.hasNext()){
			  String line = file.nextLine();
			  if(line.contains("-->")){
			KeyTermsOBJ k = new KeyTermsOBJ(line.substring(0, line.indexOf("-->")-1), line.substring(line.indexOf(">")+2));
			terms.add(k);
			  }
		  }
		  if(terms.size() ==0){
			  System.out.println("There are no terms in  to create a review game with");
		  }
		  else{
			 int numquestions = terms.size();
			 System.out.println("Your options are: ");
			 DisplayDefs(terms);
			 for(int i = numquestions-1; i>=0; i--){
				 System.out.println("Please define " + terms.get(i).getTerm());
				 String ans = console.nextLine();
				 if(ans.toLowerCase().contains(terms.get(i).getDef().toLowerCase())){
					 System.out.println("Correct!");
					 int bonus = (int)(10*Math.random());
					 if(bonus<2){
					 System.out.println("Bonus Question : How much wood could a woodchuck chuck if a woodchuck could chuck wood?(Please answer in pounds)");
						 String ans1 = console.nextLine();
						 if(ans1.contains("700")){
							 System.out.println("You are correct!");
						 }
						 else{
							 System.out.println("Some people just don't know the things that really matter in life...");
						 }
					 }
					 
				 }
				 else{
					 System.out.println("Incorrect!");
					 System.out.println("The Correct Answer is " + terms.get(i).getDef());
				 }
			 }
			 
		  }
		}
		catch(IOException ex){
			System.out.println("That file does not exist, please enter a valid file name");
			getQuizTerms();
		}
		
	}
	public static void DisplayDefs(List<KeyTermsOBJ> terms){
		for(KeyTermsOBJ word: terms){
			System.out.println(word.getDef());
		}
	}
}
