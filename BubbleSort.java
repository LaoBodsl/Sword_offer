/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {3,4,5,2,1};
        sort(list);
    }

    private static void sort(int[] list) {
        for(int i=0;i<list.length;i++){
            for(int j=i;j<list.length;j++){
                if(list[i]>list[j])
                {
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}