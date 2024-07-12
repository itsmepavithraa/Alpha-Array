import java.util.*;
public class twodarraycreation {
    public static void main(String[] args) {
        int n=3, m=3;
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){    //outer loop
            for(int j=0;j<m;j++){    //inner loop
                matrix[i][j] = sc.nextInt();
            }
        }
        //output printing
        for(int i=0;i<n;i++){    
            for(int j=0;j<m;j++){   
               System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
