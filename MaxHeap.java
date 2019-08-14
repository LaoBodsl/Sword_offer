/**
 * MaxHeap
 */
public class MaxHeap {

    private int data[];//存放堆数据的数组
    private int size;//当前堆的大小
    private int capacity;//堆的最大容量

    public MaxHeap(int maxSize){
        data = new int[maxSize+1];
        this.size=0;
        this.capacity=maxSize;
    }
    public void insert(int d){
        if(size==capacity){
            System.out.println("堆已满");
            return;
        }
        data[size+1]=d;
        size++;
        shiftUp(size);
    }

    private void shiftUp(int i) {
        //当此元素比父元素大时,交换这两个元素位置
        while(i>1&&data[i]>data[i/2]){
            int t=data[i];
            data[i]=data[i/2];
            data[i/2]=t;
            i/=2;
        }
    }
    public int deleteMax(){
        if(size==0){
            System.out.println("堆已经是空的了");
            return -1;
        }
        int t = data[1];
        data[1]=data[size];
        size--;
        shiftDown(1);
        return t;
    }

    private void shiftDown(int i) {
        while(2*i<=size){
            int j=2*i;
            if(j+1<=size&&data[j]<data[j+1]){
                j+=1;
            }
            if(data[i]>data[j])
                break;
            int t = data[i];
            data[i]=data[j];
            data[j]=t;
            i=j;
        }
    }
}