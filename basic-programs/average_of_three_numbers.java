import java.util.Scanner;

public class average_of_three_numbers {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print(" Enter first number  :");
      double num2=sc.nextInt();
      System.out.print(" Enter second number :");
      double num1=sc.nextInt();
      System.out.print(" Enter third number   :");
      double num3 =sc.nextInt();
      double simple_interest=(num1+num2+num3)/3;
            System.out.print("The area of circle : " + simple_interest);
    } 
}
