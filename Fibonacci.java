import java.util.Iterator;

public class Fibonacci {
public static void main(String[] args) {
	int num1=0;
	int num2=1;
	int num3;
	System.out.print(num1+" "+num2+" ");
	for (int i = 2; i < 8; i++) {
		num3=num1+num2;
		num1=num2;
		num2=num3;
		System.out.print(num3+" ");
	}
}
}
