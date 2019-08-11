/**
 * problem242
 */
public class problem242 {

    public static void main(String[] args) {
        ListNode list = new ListNode();
        for(int i=0;i<10;i++){
            list.addData(i);
        }
        funCore(list.head);
    }

    private static void funCore(Node head) {
        Node newHead=null;
        Node CurNode=head;
        Node preNode=null;
        while(CurNode!=null){
            Node nodeNext = CurNode.next;
            if(nodeNext==null){
                newHead=CurNode;
            }
            CurNode.next=preNode;
            preNode=CurNode;
            CurNode=nodeNext;
        }
        while(newHead!=null){
            System.out.print(newHead.data+"-->");
            newHead=newHead.next;

        }
    }
}