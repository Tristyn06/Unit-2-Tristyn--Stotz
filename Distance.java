import java.util.Scanner;

public class Distance {
  public static void main(String[] args){
      Scanner points = new Scanner(System.in);
      double x1 = points.nextDouble();
      System.out.println(“What is y1: “ );
      double y1 = points.nextDouble();
      System.out.println(“What is x2: “ );
      double x2 = points.nextDouble();
      System.out.println(“What is y2: “ );
      double y2 = points.nextDouble();
      double xDif =x1 - x2;
      double yDif = y1-y2;
      double xSqrd = Math.pow(xDif, 2);
      double ySqrd = Math.pow(yDif, 2);
      double Total = xSqrd +ySqrd;
      double distance = Math.sqrt(Total);
