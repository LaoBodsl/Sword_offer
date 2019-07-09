import java.util.Scanner;

/**
 * problem4
 */
public class problem4 {

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean res = Find(arr,key);
        System.out.println(res);
        sc.close();
    }

    private static boolean Find(int[][] arr, int key) {
        int rows = arr.length;
        int cols = arr[0].length;
        int row = 0;
        int col = cols-1;
        while(col>=0&&row<rows){
            if(arr[row][col]==key){
                return true;
            }
            else if(arr[row][col]<key){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}