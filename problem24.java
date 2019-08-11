

/**
 * problem23
 */
public class problem24 {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        for(int i=0;i<10;i++){
            list.addData(i);
        }
        Node newHead = funCore(list.head);
        list.printList(newHead);
    }

    private static Node funCore(Node head) {
        if(head==null||head.next==null){
            return head;
        }
        else{
            Node newHead = funCore(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
    }
}