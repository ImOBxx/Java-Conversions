import java.util.Scanner;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		System.out.println("Enter the Number : ");
		str = in.next();
		System.out.println("String Value : " + str);
		int int_val = 0;
		int_val = Integer.valueOf(str).intValue();
		System.out.println("Integer Value Using intValue() Method : " + int_val);
		int_val = Integer.parseInt(str);
		System.out.println("Integer Value Using parseInt() Method : " + int_val);
		


	}

}
