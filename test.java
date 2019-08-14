import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] list = new char[m][n];  
        Scanner csc = new Scanner(System.in);    
        for(int i=0;i<3;i++){
            String str = csc.nextLine();
            for(int j=0;j<3;j++){
                list[i][j]=str.charAt(j);
            }
        }
        sc.close();
        csc.close();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(list[i][j]);
            }
        }
    }
}