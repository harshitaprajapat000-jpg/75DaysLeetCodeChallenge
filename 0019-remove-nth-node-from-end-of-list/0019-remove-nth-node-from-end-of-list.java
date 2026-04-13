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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null)
        return null;
        int count=0;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int k=count-n+1;
        if(k==1){
        head=head.next;
        return head;}
        temp=head;
        count=0;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=temp.next;
                return head;
            }
            prev=temp;
            temp=temp.next;
        }

        return head;
    }
}