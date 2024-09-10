import java.util.Scanner;

public class StringtoFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		System.out.println("Enter the Float Value : ");
		str = in.next();
		System.out.println("String value : " + str);
		float float_val = 0;
		float_val = Float.valueOf(str).floatValue();
		System.out.println("Float Value using floatValue() Method : " + float_val);
		float_val = Float.parseFloat(str);
		System.out.println("Float Value Using parseFloat() Method : " + float_val);
		
		

	}

}
