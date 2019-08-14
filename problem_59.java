import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;


/**
 * problem_59
 */
public class problem_59 {

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int[] arr =  {10,14,12,11};
        int Wsize = 1;
        res = MaxInWindows(arr,Wsize);
        System.out.println(res);
    }

    private static ArrayList<Integer> MaxInWindows( int[] arr, int wsize) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Deque<Integer> index = new ArrayDeque<Integer>();
        if(arr.length>wsize&&wsize>1){
            for(int i=0;i<wsize;i++){
                while(!index.isEmpty()&&arr[i]>=arr[index.peekLast()]){
                    index.pollLast();
                }
                index.addLast(i);
            }
            for(int i=wsize;i<arr.length;i++){
                res.add(arr[index.peekFirst()]);
                while(!index.isEmpty()&&arr[i]>=arr[index.peekLast()])
                    index.pollLast();
                if(!index.isEmpty()&&index.peekFirst()<=(int)(i-wsize))
                    index.removeFirst();
                index.addLast(i);
            }
            res.add(arr[index.peekFirst()]);
        }
		return res;
	}

}