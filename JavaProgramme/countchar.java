import java.util.Scanner;  
public class Q11 
{ 
	public static int count(String str, char a) 
	{  
		int count = 0;  
		for (int i = 0; i < str.length(); i++) 
			{  
				if (str.charAt(i) == a) 
					{  
						count++;  
					}  
			}  
				return count;  
	}  
			public static void main(String[] args) 
			{  
				Scanner scanner = new Scanner(System.in);  
				System.out.print("Enter a string: ");  
				String inputString = scanner.nextLine();  
				System.out.print("Enter a character to count: ");  
				char character = scanner.next().charAt(0);  
				int occurrences = count(inputString, character);  
				System.out.println("The character '" + character + "' appears " + occurrences + " time(s) in the string \"" + inputString + "\".");  
				scanner.close();
			}
}