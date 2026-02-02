import java.util.Scanner;

public class Array_update {
    public static void main(String[] args) {
        int [] Marks={50,85,60,70};
Scanner sc= new Scanner(System.in);
for(int i=0;i<Marks.length;i++){
System.out.println(Marks[i]);}
System.out.println("New array is ");
 Marks[3]=100;
Marks[2]=200;
Marks[0]=400;
Marks[1]=300;
for(int i=0;i<Marks.length;i++){
System.out.println(Marks[i]);}
    }
}