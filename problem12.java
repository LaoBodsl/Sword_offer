import java.util.Scanner;

/**
 * problem12
 */
public class problem12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] matrix = new char[m][n];
        Scanner csc = new Scanner(System.in);
        for(int i=0;i<m;i++){
            String str = csc.nextLine();
            for(int j=0;j<n;j++){
                matrix[i][j]=str.charAt(j);
            }
        }
        sc.close();
        csc.close();
        funCore(matrix,m,j)
        
    }
}