/*
5. Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
import java.util.Scanner;

class assign5
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("Input First Number=");
int n1=sc.nextInt();
System.out.println("Input Second Number=");
int n2=sc.nextInt();
int mul=n1*n2;
System.out.println("Multiplication is " +mul);
}
}
