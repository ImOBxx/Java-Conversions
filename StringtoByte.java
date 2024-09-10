import java.util.Scanner;

public class StringtoByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		System.out.println("Enter the Number : ");
		str = in.next();
		System.out.println("String Value : " + str);
		byte byte_Val = 0;
		byte_Val = Byte.valueOf(str).byteValue();
		System.out.println("Byte value Using byteValue() Method : " + byte_Val);
		byte_Val = Byte.parseByte(str);
		System.out.println("Byte value Using parseByte() Method : " + byte_Val);
	}

}
