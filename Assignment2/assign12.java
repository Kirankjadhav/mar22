/*
12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers. 
*/
import java.util.Scanner;
class assign12
{ 
  
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		 System.out.println("Enter three no=");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
int avg=(a+b+c)/3;
System.out.println("Average of three no = "+avg);
    }
}

