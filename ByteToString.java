import java.util.Scanner;

public class ByteToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str;
		byte byte_val = 0;
		System.out.println("Enter the Byte Value : ");
		byte_val = in.nextByte();
		str = Byte.toString(byte_val);
		System.out.println("String value : " + str);
		

	}

}
