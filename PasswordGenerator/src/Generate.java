import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Generate {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		Scanner ip = new Scanner (System.in);
		System.out.println("Input password length");
		int len = ip.nextInt();
		String[] passwordArray = new String[len];

		for (int i = 0; i < len; i++){
			Random rand = new Random();
			int element= (int) (Math.random() * (127 - 33)) + 33;
			passwordArray[i] = Character.toString((char) element);
		}

		StringBuilder builder = new StringBuilder();
		for(String s : passwordArray) {
			builder.append(s);
		}
		String password = builder.toString();

		try { 

			// Open given file in append mode. 
			BufferedWriter out = new BufferedWriter( 
					new FileWriter("C:/Users/slatt/workspace/passwords.txt", true)); 
			out.write(password); 
			out.close(); 
		} 
		catch (IOException e) { 
			System.out.println("exception occoured" + e); 
		}

	}
}


