
import java.util.Scanner;
public class Calculate_Simple_Interest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print(" Enter value of principle :");
      double principle=sc.nextInt();
      System.out.print(" Enter value of rate :");
      double rate=sc.nextInt();
      System.out.print(" Enter value of time   :");
      double time =sc.nextInt();
      double simple_interest=(principle*rate*time)/100;
            System.out.print("The area of circle : " + simple_interest);
    } 
   
}
