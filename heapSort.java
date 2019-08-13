/**
 * heapSort
 */
public class heapSort {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);
        for(int i=0;i<10;i++){
            heap.insert(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(heap.deleteMax());
        }
    }
}