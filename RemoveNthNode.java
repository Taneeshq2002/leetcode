
 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
       int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        // System.out.println(size);
        if(size==1){
            head=null;
            return head;
        }
        else if(size==n){
            head=head.next;
            return head;
        }
        int len=size-n;
        // System.out.println(len);
        int i=0;
        ListNode prev=head;
        temp=head.next;
        while(i!=len-1){
            temp=temp.next;
            prev=prev.next;
            i++;
        }
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}