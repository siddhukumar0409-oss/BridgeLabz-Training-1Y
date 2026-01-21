import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your  first number : ");
        double num1=sc.nextDouble();
    System.err.print("Enter your  Second  number : ");
        double num2=sc.nextDouble(); 
        double  addition=(num1+num2);
        double subtraction=(num1-num2);
        double multiplication=(num1*num2);
        double division=(num1/num2);
 System.out.println("Addition of   "+num1  +" and " + num2 +" is ==>   "+addition);    
  System.out.println("subtraction of   "+num1  +" and " + num2 +" is ==>   "+subtraction);                                   
 System.out.println("Multiplication  of   "+num1  +" and " + num2 +" is ==>   "+multiplication);                                   
                  if (num2!=0){
                      System.out.print("Division  of   "+num1  +" and " + num2 +" is ==>   "+division);                                   

                  }
                  else {
                      System.out.print("Division  of   "+num1  +" and " + num2 +" is ==>   undefined " );                                   

                  }
    }
}
