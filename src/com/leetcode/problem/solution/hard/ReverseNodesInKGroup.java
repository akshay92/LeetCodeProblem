package com.leetcode.problem.solution.hard;

import com.leetcode.problem.solution.common.ListNode;

public class ReverseNodesInKGroup {


    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode current = head;
         int count =0;
         while (current != null && count != k){
             count++;
             current = current.next;
         }

         if(k == count){
             current = reverseKGroup(current, k);

             while(count-- > 0){
                 ListNode temp = head.next;
                 head.next = current;
                 current = head;
                 head = temp;
             }

             head = current;
         }


         return head;
    }


    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        ReverseNodesInKGroup test = new ReverseNodesInKGroup();
        test.reverseKGroup(node, 2);
    }



}
