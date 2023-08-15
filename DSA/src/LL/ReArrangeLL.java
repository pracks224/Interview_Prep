package LL;

public class ReArrangeLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
       /* ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(7);*/
        head.next = null;
       /* node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;*/
       // node6.next = null;
        printLL(head);
        //   head = reverseLL(head);
        //  printLL(head);
        head = reOrderList(head);
        printLL(head);
    }

    static void printLL(ListNode A) {
        while (A != null) {
            System.out.print(A.val + "->");
            A = A.next;
        }
        System.out.println(" ");
    }

    static ListNode reverseLL(ListNode A) {
        ListNode prev = null, curr = A, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        A = prev;
        return A;
    }


    static ListNode reOrderList(ListNode A) {
        //find middle
        ListNode slow = A, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode llOne = A;
        ListNode llTwo = slow.next;
        slow.next = null;
        llTwo = reverseLL(llTwo);
        //merge
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(llOne != null || llTwo != null){
            if(llOne != null){
                curr.next = llOne;
                curr = curr.next;
                llOne = llOne.next;
            }
            if(llTwo != null){
                curr.next = llTwo;
                curr = curr.next;
                llTwo = llTwo.next;
            }
        }
        dummy = dummy.next;
        return dummy;
    }

}
