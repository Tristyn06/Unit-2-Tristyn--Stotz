import java.util.Scanner;


public class Time{
public static void main(String[] args){
int hours;
int minutes;
int seconds;
int output;
Scanner scan = new Scanner(System.in);
System.out.println(“Hours: “);
hours = scan.nextInt();
System.out.println(“Minutes: “);
minutes = scan.nextInt();
System.out.println(“Seconds: “);
seconds = scan.nextInt();
output = seconds + minutes * 60 + hours * 3600;
System.out.println(“The time in seconds is: “ + output);
}
}
