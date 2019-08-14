import java.util.ArrayList;
public class problem57 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int low=0;
        int high = array.length-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(high>low){
            if(array[low]+array[high]==sum){
                res.add(array[low]);
                res.add(array[high]);
                return res;
            }
            else if(array[low]+array[high]>sum){
                high--;
            }
            else{
                low++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,15};
        int sum = 15;
        problem57 re = new problem57();
        System.out.println(re.FindNumbersWithSum(array,sum)); 
    }
}