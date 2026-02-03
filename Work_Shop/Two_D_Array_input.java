import java.util.Scanner;

public class Two_D_Array_input {
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter first array size :");
int size1=sc.nextInt();
System.out.print("Enter second array size : ");    
int size2=sc.nextInt();
int [][]arr=new int [size1][size2];
for(int i=0;i<size1;i++){
    for(int j=0;j<size2;j++){
        arr[i][j]=sc.nextInt();
    }

}
System.out.println("2D array elements are ");
for(int i=0;i<size1;i++){
    for(int j=0;j<size2;j++){
       System.out.print(arr[i][j]);
       System.out.print(" ");
    }System.out.println();
}

}   }
