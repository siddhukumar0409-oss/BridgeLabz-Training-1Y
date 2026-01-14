
import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter temperature in celsius :");
double temp=sc.nextInt();
double Fahrenheit=(temp*9/5)+32;
System.out.print("Given celsius in fahrenheit : "+ Fahrenheit);
    }
}
