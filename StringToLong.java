import java.util.Scanner;

public class StringToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		System.out.println("Enter the Number : ");
		str = in.next();
		System.out.println("String Value : " + str);
		long long_val = 0;
		long_val = Long.valueOf(str).longValue();
		System.out.println("Long Value Using longValue() Method : " + long_val);
		long_val = Long.parseLong(str);
		System.out.println("Long Value Using parseLong() Method : " + long_val);
		

	}

}
