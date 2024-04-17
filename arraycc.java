import java.util.*;
public class arraycc{
public static void main(String[] args){
    int marks[] = new int[4];
    
    // Storing elements in the array
    Scanner sc = new Scanner(System.in);
    marks[0]=sc.nextInt();
    marks[1]=sc.nextInt();
    marks[2]=sc.nextInt();

    //output
    System.out.println("Tamil: "+ marks[0]);
    System.out.println("English: "+ marks[1]);
    System.out.println("Math: "+ marks[2]);

    }
}