import java.util.Scanner;

public class String_toShortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String str = in.next();
		System.out.println("String Value : " + str);
		short short_val = 0;
		short_val = Short.valueOf(str).shortValue();
		System.out.println("Short Value Using shortVlaue() method : " + short_val);
		short_val = Short.parseShort(str);
		System.out.println("Short Value Using parseShort() method : " + short_val);
		
;
		
	}

}
