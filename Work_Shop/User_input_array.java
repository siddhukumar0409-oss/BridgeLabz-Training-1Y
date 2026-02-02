import java.util.Scanner;
public class User_input_array {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter length of array :");
      int num=sc.nextInt();
      int[] array=new int[num];
      for(int i=0;i<num;i++){
        array[i]=sc.nextInt();
      } 
      for(int i=0;i<num;i++){
      System.out.println(array[i]);
      } 
    }
}
