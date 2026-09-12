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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode n=new ListNode(list1.val);
                dummy.next=n;
                dummy=dummy.next;
                n.next=null;
                list1=list1.next;
            }else{
                ListNode n=new ListNode(list2.val);
                dummy.next=n;
                dummy=dummy.next;
                n.next=null;
                list2=list2.next;
            }
        }
        if(list1!=null){
            //ListNode n=new ListNode(list1.val);
                dummy.next=list1;
                //dummy=dummy.next;
                //list1=list1.next;
        }
        if(list2!=null){
            dummy.next=list2;
        }
        return head.next;
    }
}