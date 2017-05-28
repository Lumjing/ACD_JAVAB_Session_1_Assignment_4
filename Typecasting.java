import java.util.Scanner;

//Write a program in java to implement type casting between different variables
public class Typecasting {

	public static void main(String[] args) {
//Take six variables as one of each byte, short, int, long, float and double. 		
	byte num1;
	short num2;
	int num3;
	long num4;
	float num5;
	double num6;
//Initialize only byte and short asking the value from the user.
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the byte value: ");
	num1=s.nextByte();
	System.out.println("Enter the short value: ");
	num2=s.nextShort();
//Take byte & short variables and store their sum in the integer variable and print the sum
	num3=num1+num2;
	System.out.println("The sum of "+num1+" and " +num2+ " is :"+ num3);
//Then take short and int and store their addition in a long variable and now take an int
//and long and so on.
	num4=num2+num3;
	System.out.println("The sum of "+num2+" and "+num3+" is :" +num4);
	num5=num3+num4;
	System.out.println("The sum of "+num3+" and "+num4+" is :" + num5);
	num6=num4+num5;
	System.out.println("The sum of "+num4+" and "+num5+" is :"+ num6);
	s.close();

	}

}
