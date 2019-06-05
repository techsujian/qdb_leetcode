
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val=x;
    }
}
public class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int flag=0;
        ListNode first = null;
        while (l1!=null || l2!=null){
            int sum=0;
            if (l1!=null && l2!=null){
                sum = l1.val+l2.val;
                l1=l1.next;
                l2=l2.next;
            }else if (l1!=null){
                sum = l1.val;
                l1=l1.next;
            }else if (l2!=null){
                sum = l2.val;
                l2=l2.next;
            }else{
                break;
            }
            sum+=flag;
            flag = 0;
            if (sum>=10){
                flag = 1;
                sum-=10;
            }
            if (result==null){
                result = new ListNode(sum);
                first = result;
            }else{
                ListNode next = new ListNode(sum);
                result.next = next;
                result = next;
            }
        }
        if (flag>0){
            ListNode next = new ListNode(flag);
            result.next = next;
        }
        return first;
    }

    public static void main(String[] args){
        ListNode l1= new ListNode(1);
        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);

        ListNode l2=new ListNode(0);
//        l2.next = new ListNode(6);
//        l2.next.next=new ListNode(4);

        ListNode result = new AddTwoNumbers().addTwoNumbers(l1,l2);

        ListNode v = result;

        while (v!=null){
            System.out.print( v.val + "->");
            v=v.next;
        }
    }
}
