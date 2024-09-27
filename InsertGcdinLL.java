
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class InsertGcdinLL {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }

        temp=head;

        while(length>1){
            int gcd=gcdofTwoNums(temp.val,temp.next.val);

            ListNode gcdNode=new ListNode(gcd);

            gcdNode.next=temp.next;
            temp.next=gcdNode;
            temp=gcdNode.next;
            length--;
        }
        
        return head;
    }

    public int gcdofTwoNums(int a,int b){
        int gcd=1;

        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }

        return gcd;
    }
}
