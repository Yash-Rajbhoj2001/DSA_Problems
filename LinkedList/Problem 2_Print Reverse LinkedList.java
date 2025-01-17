/*Given the head of a singly linked list, reverse the list, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:
Input: head = [1,2]
Output: [2,1]
Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

Solution:
-------------------------------------------------------------------------------------------------------------------------------------
*/



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        //write your logic here
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr.next != null)
        {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }
        head = prev;
        return head;
    }

    // Helper function to print the list from a given node
    public void printListFromNode(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1: [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        
        ListNode middle1 = solution.reverseList(head1);
        System.out.print("Middle node(s) starting from: ");
        solution.printListFromNode(middle1);
        
        // Example 2: [1,2,3,4,5,6]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        
        ListNode middle2 = solution.reverseList(head2);
        System.out.print("Middle node(s) starting from: ");
        solution.printListFromNode(middle2);
    }
}
