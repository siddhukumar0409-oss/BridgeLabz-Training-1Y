import java.util.Scanner;
public class Array_element_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size =sc.nextInt();
        int[] array=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for (int  i : array){
        sum+=i;
    }
    System.out.println(sum);
    }
}
