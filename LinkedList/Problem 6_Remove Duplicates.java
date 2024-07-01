/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Example 1:
Input: head = [1,1,2]
Output: [1,2]

Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 
Constraints:
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.

Solution:
----------------------------------------------------------------------------------------------------------------------------------
*/



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       //write your logic here
       ListNode start = head;
      // ListNode second = head;
      while(start.next != null)
      {
        if(start.next.val == start.val)
        {
          start.next = start.next.next;
        }
        else
        {
          start = start.next;
        }
      }
      return head;
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Test the solution with example cases
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] arr1 = {1, 1, 2};
        ListNode head1 = createLinkedList(arr1);
        ListNode newHead1 = solution.deleteDuplicates(head1);
        printLinkedList(newHead1);  // Output: 1 2

        // Example 2
        int[] arr2 = {1, 1, 2, 3, 3};
        ListNode head2 = createLinkedList(arr2);
        ListNode newHead2 = solution.deleteDuplicates(head2);
        printLinkedList(newHead2);  // Output: 1 2 3
    }
}
