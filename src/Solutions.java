//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Solutions {
    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode cur = res;
        int temp = 0;
        while (l1 != null || l2 != null){
            int val1 = (l1!= null) ? l1.val : 0;
            int val2 = (l2!= null) ? l2.val : 0;
            int sum = val1 + val2 + temp;
            temp = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(l1 != null ) l1 = l1.next;
            if(l2  != null) l2 = l2.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Solutions s1 = new Solutions() ;
        Solutions.ListNode l1 = s1.new ListNode(4);
        l1.next = s1.new ListNode(5);
        l1.next = s1.new ListNode(6);

        Solutions.ListNode l2 = s1.new ListNode(4);
        l2.next = s1.new ListNode(5);
        l2.next = s1.new ListNode(6);

        Solutions.ListNode res = s1.addTwoNumbers(l1, l2);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }

}