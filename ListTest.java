/**
 * ListTest
 */
public class ListTest {
    public static void main(String[] args) {
        ListNode mylist = new ListNode();
        for(int i=0;i<10;i++){
            mylist.addData(i);
        }
        mylist.printList(mylist.head);
    }
}