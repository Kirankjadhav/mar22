/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
import java.util.Scanner;

class assign6
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("Input First Number=");
int n1=sc.nextInt();
System.out.println("Input Second Number=");
int n2=sc.nextInt();

int add=n1+n2;
System.out.println(+n1+ " + " +n2+ "=" +add);

int sub=n1-n2;
System.out.println(+n1+ " - " +n2+ "=" +sub);

int mul=n1*n2;
System.out.println(+n1+ " x " +n2+ "=" +mul);

int div=n1/n2;
System.out.println(+n1+ " / " +n2+ "=" +div);

int mod=n1%n2;
System.out.println(+n1+ " mod " +n2+ "=" +mod);
}
}
