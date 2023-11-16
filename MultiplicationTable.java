import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;

public class MultiplicationTable{
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter a file name: ");
		String fileName = scanner.next();
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write("This is a multiplication Table");
			writer.newLine();
				
			
			for( int i = 1; i <= 9; i++) {
				for (int j = 1; j<= i; j++) {
					int result = i * j;
					writer.write(i + " x " + j + " = " + result + " " );
					
				}
				writer.newLine();
			}
			
			writer.close();
			System.out.println("Output file has been created:" + fileName);
			}	catch (IOException e) {
				System.err.println("An Error has occured"); {
					
				}
		}
		
	}
	
}
