import java.awt.JobAttributes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Caesar {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		//getting a filename from the user
		String filename = JOptionPane.showInputDialog("Enter a filename");
		JOptionPane.showMessageDialog(null, "The file name is: " + filename);
		//Open the file
		
		Scanner file = new Scanner(new File("/home/student/" +filename));
		String aLine = file.nextLine();
		System.out.println(aLine);
		
		//call encode on the caeser cipher class
		
		//read another line
		aLine = file.nextLine();
		System.out.println(aLine);
		
		//read past the end of the file
		aLine = file.nextLine();
		System.out.println(aLine);
		
		
	*/
		Cipher myCipher = new Cipher("abcdefghijklmnopqrstuvwxyz");
		myCipher.setAlpha("abcdefghijklmnopqrstuvwxyz.!,$%;:");
		
/*
		//System.out.println("Cipher Text = " + myCipher.encode("The quick brown fox", 18));
		//System.out.println("Cipher Text = " + myCipher.encode("Happy halloween", 10));
		
		JOptionPane.showMessageDialog(null, "Hello World!");
		String answer = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "The user answer: " + answer);
		Object [] options = {"option 1", "option 2", "option 3"};
		Object optionPicked = JOptionPane.showInputDialog(null, "Select an Option", "Option Menu",
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		JOptionPane.showMessageDialog(null, "The option picked: " + optionPicked);
		*/

				
	
				JOptionPane.showMessageDialog(null, "Caeser Cipher Program");

				Object [] menuOps = {"Encode", "Decode", "Crack", "Exit"};
				
				Object picked = JOptionPane.showInputDialog(null, "Select an Option", "Option Menu", JOptionPane.PLAIN_MESSAGE,
						null, menuOps, menuOps[0]);
				if(picked =="Exit" ) {
				
				}
				else if(picked == "Encode") {
					String plainText = JOptionPane.showInputDialog("Enter plain text to cipher");
						if(plainText.length() <= 0) {
							JOptionPane.showMessageDialog(null, "String value is null");
						}
			
					
					JOptionPane.showMessageDialog(null, "The plain text is: "+ plainText);
					Object [] keys = {1,2,3,4,5};
					Object keyPicked = JOptionPane.showInputDialog(null, "Choose a key value", "Key menu", JOptionPane.PLAIN_MESSAGE, null, keys, keys[0]);
					int i = (int) keyPicked;
					JOptionPane.showMessageDialog(null, myCipher.encode(plainText,i));
					
				}
				
		

	}

}

class Cipher {
	char ptChar = ' ';
	int alphaIndex = 0;
	int enIndex = 0;
	String encoding = " ";
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz";
	

	public Cipher(String newAlphabet) {
		setAlpha(newAlphabet);
	}
		
	public void setAlpha(String newAlphabet) {
		this.alpha = newAlphabet;
	}
	
	
	public String encode(String plainText, int key ) {
		String encoding = " ";	
		for(int i = 0; i < plainText.length(); i ++) {
			ptChar = plainText.charAt(i);
			
			alphaIndex = alpha.indexOf(ptChar);
			
			enIndex = (alphaIndex + key) % alpha.length();
			
			if(ptChar == ' ') {
				encoding = encoding + ' ' ;
			}
			else {
				alphaIndex = alpha.indexOf(ptChar);
				alphaIndex = (alphaIndex + key) %alpha.length();
				
			}
		
			encoding = encoding + alpha.charAt(enIndex);
		}
		
		return(encoding);

	}

}


