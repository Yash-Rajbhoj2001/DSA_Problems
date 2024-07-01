class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode middleNode(ListNode head) 
    {
       //write your logic here
       if(head == null)
       {
         return head;
       }
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null)
       {
         slow = slow.next;
         fast = fast.next.next;
       }
       return slow;
    }

    
    public void printListFromNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1: [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        
        ListNode middle1 = solution.middleNode(head1);
        System.out.print("Middle node(s) starting from: ");
        solution.printListFromNode(middle1);
        
        // Example 2: [1,2,3,4,5,6]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        
        ListNode middle2 = solution.middleNode(head2);
        System.out.print("Middle node(s) starting from: ");
        solution.printListFromNode(middle2);
    }
}
