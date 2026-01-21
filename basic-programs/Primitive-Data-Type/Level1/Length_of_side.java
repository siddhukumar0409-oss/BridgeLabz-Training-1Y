import java.util.Scanner;

public class Length_of_side {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.err.print("Enter value of perimeter :");
    double perimeter=sc.nextDouble();
    double length=     (perimeter/4.0);
   System.out.print("The length of side is ==> "+length+"  whose perimeter is ==> "+perimeter);
  
    }
}
