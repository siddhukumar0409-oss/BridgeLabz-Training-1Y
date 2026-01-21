import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.err.print("Enter number of students :");
    double num=sc.nextDouble();          //Number of students
    double max=(num*(num-1))/2;
    System.out.println("The maximum number of handshake is  ==>   "+max);
    }
}
