package com.AddTwoNumbers;
import com.AddTwoNumbers.ListNode;
/**
 * Created by guoyu on 10/8/2016.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode((l1.val + l2.val)%10);
        int p = (l1.val + l2.val)/10;
        ListNode tem = result;
        while(true){
            if(l2.next!=null&&l1.next!= null){
                l1 = l1.next;
                l2 = l2.next;
            }else if(l2.next==null&&l1.next==null){
                break;

            }else if(l1.next==null){
                l1.next = new ListNode(0);
                l1 = l1.next;
                l2 = l2.next;
            }else{
                l2.next = new ListNode(0);
                l2 = l2.next;
                l1 = l1.next;
            }

            tem.next = new ListNode((l1.val + l2.val + p)%10);
            p = (l1.val + l2.val + p)/10;
            tem = tem.next;
        }
        if(p>0){
            tem.next = new ListNode(1);
        }
        return result;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
        ListNode result = addTwoNumbers(l1,l2);
        System.out.print(result);
    }

}
