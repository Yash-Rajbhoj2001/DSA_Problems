/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 

Follow up: Could you do this in one pass?

Solution:
------------------------------------------------------------------------------------------------------------------------------------
*/


import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    // Method to build a linked list from an array
    public static ListNode buildList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : vals) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //write your main logic here
        ListNode first = head;
        ListNode second = head;
        for(int i=1 ; i<n+1 ; i++)
        {
          first = first.next;
        }
        while(first.next != null)
        {
          first = first.next;
          second = second.next;
        }
        if(second.next != null)
        {
          second = second.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the linked list
        System.out.println("Enter the number of elements in the linked list:");
        int size = scanner.nextInt();
        int[] values = new int[size];

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        // Input for the value of n
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        ListNode head = buildList(values);
        
        System.out.println("Original list:");
        printList(head);
        
        head = solution.removeNthFromEnd(head, n);
        
        System.out.println("List after removing the " + n + "-th node from the end:");
        printList(head);
    }
}
