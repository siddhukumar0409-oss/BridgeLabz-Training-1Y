import java.util.Scanner;
public class Perimeter_of_a_Rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter length of rectangle  :");
      double length=sc.nextInt();
      System.out.print(" Enter breadth of rectangle :");
      double breadth=sc.nextInt();
      double sum=2*(length+breadth);
            System.out.print("The sum of two numbers is  :" + sum);
    }
}