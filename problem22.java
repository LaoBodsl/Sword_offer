import java.util.Scanner;

/**
 * problem22
 */
public class problem22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode list = new ListNode();
        for(int i=0;i<10;i++){
            list.addData(i);
        }
        sc.close();
        funCore(list.head,n);
    }

    private static void funCore(Node head, int n) {
        Node p1 = head;
        Node p2=head;
        for(int i=0;i<n-1;i++){
            p1=p1.next;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        System.out.println(p2.data);
    }
}