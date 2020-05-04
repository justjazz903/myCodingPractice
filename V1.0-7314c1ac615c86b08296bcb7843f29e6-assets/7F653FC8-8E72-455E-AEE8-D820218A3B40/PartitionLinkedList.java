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
  public ListNode partition(ListNode head, int target) {
    // Write your solution here
    if(head == null || head.next == null){
      return head;
    }
    ListNode small = new ListNode(0);
    ListNode large = new ListNode(0);
    ListNode smallCur = small;
    ListNode largeCur = large;
    while(head != null){
      if(head.value >= target){
        largeCur.next = head;
        largeCur = largeCur.next;
      }
      else{
        smallCur.next = head;
        smallCur = smallCur.next;
      }
      head = head.next;
    }
    smallCur.next = large.next;
    largeCur.next = null;
    return small.next;
  }
}
