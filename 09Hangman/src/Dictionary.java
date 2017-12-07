import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
	private int MaxWords = 300;
	private String filename = "/home/student/hangman.txt";
	private String[] dictionary = new String[MaxWords];
	
	public Dictionary() throws FileNotFoundException {
		System.out.println("Dictionary made");
		
		File dictFile = new File(filename); 
		Scanner dictScan = new Scanner(dictFile);
		
		int i = 0;
		while(dictScan.hasNextLine()) {
			dictionary[i] = dictScan.nextLine();
			i++;
			
		}
	}
	public String randomWord() {
		Random rand = new Random();
		System.out.println(rand.nextInt(20));
		return(dictionary[rand.nextInt(20)]);
	}
}

