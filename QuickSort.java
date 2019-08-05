import java.util.Scanner;

/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i]=sc.nextInt();
        }
        sc.close();
        int start=0;
        int end=n
        funCore(list,n,start,end);
    }

    private static void funCore(int[] list, int n, int start, int end) {
        int i=start;
        int j=end;
        int k=list[i];
        while(i<j){
            while(i<j&&list[j]>k){
                j--;
            }
            if(i<j){
                list[i]=list[j];
                i++;
            }
            while(i<j&&list[i]<k){
                i++;
            }
            if(i<j){
                list[j]=list[i];
                j--;
            }
            list[i]=k;
            funCore(list, n, start, i-1);
            funCore(list, n, i+1, end);
        }
        
    }
}