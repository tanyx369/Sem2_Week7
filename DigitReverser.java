import java.util.*;

public class DigitReverser 
{

	static String get;
	public static void AskInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of postive numbers: ");
		get = input.nextLine();
		
	}
	
	public static void Reverse() {
		String[] results = get.split("");
		for (int x = results.length; x>0; x--) {
			System.out.println(results[x-1]);
		}
	}
	
	public static void main(String[] args) {
		AskInput();
		Reverse();
		
	}

}
