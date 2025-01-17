/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

Solution:
----------------------------------------------------------------------------------------------------------------------------------------------------
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
