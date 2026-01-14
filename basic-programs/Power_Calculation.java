import java.util.Scanner;

public class Power_Calculation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter value of base  :");
      double base=sc.nextInt();
      System.out.print(" Enter value of exponent :");
      double exp=sc.nextInt();
      double result=Math.pow(base, exp);
            System.out.print("The sum of two numbers is  :" + result);
    }
}
