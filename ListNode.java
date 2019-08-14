/**
 * ListNode
 */
public class ListNode {
    public Node head;
    public Node current;
    // public static void main(String[] args) {
    //     ListNode list = new ListNode();
    //     for(int i=0;i<5;i++){
    //         list.addData(i);
    //     }
    //    list.printList(list.head);
    // }
    public void addData(int data){
        if(head==null){
            head=new Node(data);
            current=head;
        }else{
            current.next=new Node(data);
            current=current.next;
        }
    }
    public void printList(Node head){
        if(head!=null){
            current =head;
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
        }
    }
}
