/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
         ListNode fast=head;
         if(head==null||head.next==null)return;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
         }
        ListNode second=Reverse(slow.next);
          slow.next=null;
          ListNode first=head;
          while(second!=null){
            ListNode curr1=first.next;
            ListNode curr2=second.next;
            first.next=second;
            second.next=curr1;
            first=curr1;
            second=curr2;
          }
         
    }
    public ListNode Reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
}