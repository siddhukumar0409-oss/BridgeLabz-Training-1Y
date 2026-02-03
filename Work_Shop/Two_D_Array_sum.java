import java.util.Scanner;
public class Two_D_Array_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Rows");
        int r=sc.nextInt();
        System.out.println("Enter Coulmns");
        int c=sc.nextInt();
        int [][] array=new int[r][c];
         System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                array[i][j] = sc.nextInt();  
            }
        }
         int sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum += array[i][j];        
            }
        }
        System.out.println("Sum of 2D array  ==> "+ sum);
    }
}
