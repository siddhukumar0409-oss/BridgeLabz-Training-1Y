import java.util.Scanner;

public class Convert_Kilometers_to_Miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter length in kilometer  :");
      double length=sc.nextInt();
      double miles=(length * 0.621371);
            System.out.print("Kilometer in miles   :" + miles);
    }
}
