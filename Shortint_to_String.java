import java.util.Scanner;

public class Shortint_to_String {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str;
		short short_val;
		System.out.println("Enter the short value : ");
		short_val = in.nextShort();
		str = Short.toString(short_val);
		System.out.println("String Value : " + str);
		
		
		
	}

}
