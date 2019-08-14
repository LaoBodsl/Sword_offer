import java.util.Arrays;
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
        int end=n-1;
        funCore(list,n,start,end);
        System.out.println(Arrays.toString(list));
    }

    private static void funCore(int[] list, int n, int start, int end) {
      if(start>end){
          return;
      }
      int i=start;
      int j=end;
      int k=list[start];
      while(i<j){
          while(i<j&&k<list[j]){
              j--;
          }
          if(i<j){
              list[i++]=list[j];
          }
          while(i<j&&k>list[i]){
              i++;
          }
          if(i<j){
              list[j--]=list[i];
          }
          list[i]=k;
      }
      funCore(list, n, start, i-1);
      funCore(list, n, i+1, end);

    }
}