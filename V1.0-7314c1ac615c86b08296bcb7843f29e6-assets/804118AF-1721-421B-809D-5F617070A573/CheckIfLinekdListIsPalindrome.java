/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public boolean isPalindrome(ListNode head) {
    // Write your solution here
    if(head == null || head.next == null){
      return true;
    }
    ListNode mid = findMid(head);
    ListNode right = reverse(mid.next);
    while(right != null){
      if(head.value != right.value){
        return false;
      }
      right = right.next;
      head = head.next;
    }
    return true;
  }
  private ListNode findMid(ListNode head){
    ListNode slow = head;
    ListNode fast = head;
    while(fast.next != null && fast.next.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  private ListNode reverse(ListNode head){
    ListNode prev = null;
    while(head != null){
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}
