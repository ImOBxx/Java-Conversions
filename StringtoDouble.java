import java.util.Scanner;

public class StringtoDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		System.out.println("Enter the Number : ");
		str = in.next();
		System.out.println("String Value : " + str);
		double dou_val = 0;
		dou_val = Double.valueOf(str).doubleValue();
		System.out.println("Double Value Using doubleValue() Method : " + dou_val);
		dou_val = Double.parseDouble(str);
		System.out.println("Double Value Using parseDouble() Method : " + dou_val);
		


	}

}
