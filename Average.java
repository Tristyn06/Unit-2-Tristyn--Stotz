import java.util.Scanner;

public class Average {
 public static void main (String[] args){
Scanner input = new Scanner(System.in);
 int num1, num2, num3;
 double average;
System.out.print ("Enter the first number: ");
 num1 = input.nextInt();
 System.out.print ("Enter the second number: ");
 num2 = input.nextInt();
System.out.print ("Enter the third number: ");
 num3 = input.nextInt();
average = (double) (num1+num2+num3) / 3;
System.out.println ("The average is: " + average);
  }
}
