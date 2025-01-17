/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

 

Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
 

Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.

Solution:
----------------------------------------------------------------------------------------------------------------------------------
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
    public boolean hasCycle(ListNode head) {
        //write your main logic here
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
          slow = slow.next;
          fast = fast.next.next;
          if (slow != fast)
          {
            return true;
          }
         
        }
        return false;
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Cycle

        boolean result1 = solution.hasCycle(head1);
        System.out.println("Example 1: " + result1);  // Output: true

        // Example 2
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        head2.next = node5;
        node5.next = head2;  // Cycle

        boolean result2 = solution.hasCycle(head2);
        System.out.println("Example 2: " + result2);  // Output: true

        // Example 3
        ListNode head3 = new ListNode(1);
        boolean result3 = solution.hasCycle(head3);
        System.out.println("Example 3: " + result3);  // Output: false
    }
}
