
import java.util.Scanner;
public class Add_to_numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter your first number :");
      double num1=sc.nextInt();
      System.out.print(" Enter your second number :");
      double num2=sc.nextInt();
      double sum=(num1+num2);
            System.out.print("The sum of two numbers is  :" + sum);
    }
}
