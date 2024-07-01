/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

Solution:
--------------------------------------------------------------------------------------------------------------------------------
*/


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      //write your logic here
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;
      while(l1 != null && l2 != null)
      {
        if(l1.val <= l2.val)
        {
          curr.next = new ListNode(l1.val);
          l1 = l1.next;
        }
        else
        {
          curr.next = new ListNode(l2.val);
          l2 = l2.next;
        }
        curr = curr.next;
      }
      while(l1 != null)
      {
        curr.next = new ListNode(l1.val);
        l1 = l1.next;
        curr = curr.next;
      }
      while(l2 != null)
      {
        curr.next = new ListNode(l2.val);
        l2 = l2.next;
        curr = curr.next;
      }
      return dummy.next;
    }

    public static void main(String[] args) {
        // Example 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode merged1 = solution.mergeTwoLists(list1, list2);
        printList(merged1); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Example 2
        ListNode list3 = null;
        ListNode list4 = null;

        ListNode merged2 = solution.mergeTwoLists(list3, list4);
        printList(merged2); // Output: (empty list)

        // Example 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);

        ListNode merged3 = solution.mergeTwoLists(list5, list6);
        printList(merged3); // Output: 0
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}