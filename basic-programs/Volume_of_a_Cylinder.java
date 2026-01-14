import java.util.Scanner;
public class Volume_of_a_Cylinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter radius of cylinder :");
      double radius=sc.nextInt();
      System.out.print(" Enter height of cylinder  :");
      double height=sc.nextInt();
      double volume=(3.1415*radius*radius*height);
            System.out.print("The area of circle : " + volume);
}}
