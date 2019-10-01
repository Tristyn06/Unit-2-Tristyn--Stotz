public class Quiz1{
  public static void main(String[]args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName= "Hernandez";

    String first = firstName.substring(0,1);
    String middle = middleName.substring(0,1);
    String last = lastName.substring(0,1);

    String lowerFirst= first.toLowerCase();
    String lowerMiddle = middle.toLowerCase();
    String lowerLast= last.toLowerCase();

    System.out.println(lowerFirst + lowerMiddle + lowerLast);
  }
}
