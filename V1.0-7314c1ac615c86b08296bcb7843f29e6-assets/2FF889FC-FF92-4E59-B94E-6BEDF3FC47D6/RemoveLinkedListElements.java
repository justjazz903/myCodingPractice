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
  public ListNode removeElements(ListNode head, int val) {
    // Write your solution here
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = dummy;
    while(head != null){
      if(head.value == val){
        cur.next = head.next;
      }
      else{
        cur = head;
      }
      head = head.next;
    }
    return dummy.next;
  }
}
