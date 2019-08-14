/**
 * problem18
 */
public class problem18 {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        for(int i=0;i<10;i++){
            list.addData(i);
        }
         Node tempHead = list.head;
         int i=0;
         while(i<3){
             tempHead=tempHead.next;
             i++;
         }
         list.printList(list.head);
         System.out.println();
         funCore(list.head,tempHead);
         

    }

    private static void funCore(Node head, Node tempHead) {
        Node next =tempHead.next;
        tempHead.data=next.data;
        tempHead.next=next.next;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}