import java.util.Random;

public class phoneNumber{

  public static void main(String [] args){
    Random rand = new Random();
    int first = rand.nextInt(8)+2;
    int second = rand.nextInt(9);
    int third = rand.nextInt(10);

    String areaCode = first+ "" + second+"" + third;

    int fourth = rand.nextInt(8)+2;
    int five = rand.nextInt(10);
    int six  = rand.nextInt(10);

    String middleNumber =  fourth+ "" + five+"" + six;

    int seven = rand.nextInt(10);
    int eight = rand.nextInt(10);
    int nine = rand.nextInt(10);
    int ten = rand.nextInt(10);

    String lastFour = seven+ "" + eight+ "" + nine+ "" + ten;

    System.out.println("Phone Number: " + areaCode + middleNumber + lastFour);

  }
}
