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
  public ListNode mergeSort(ListNode head) {
    // Write your solution here
    if(head == null || head.next == null){
      return head;
    }
    ListNode mid = findMid(head);
    ListNode midNext = mid.next;
    mid.next = null;
    ListNode left = mergeSort(head);
    ListNode right = mergeSort(midNext);
    return merge(left, right);
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
  private ListNode merge(ListNode left, ListNode right){
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while(left != null && right != null){
      if(left.value < right.value){
        cur.next = left;
        left = left.next;
      }
      else{
        cur.next = right;
        right = right.next;
      }
      cur = cur.next;
    }
    if(left != null){
      cur.next = left;
    }
    else{
      cur.next = right;
    }
    return dummy.next;
  }
}
