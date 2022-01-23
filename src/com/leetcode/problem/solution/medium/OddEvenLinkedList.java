package com.leetcode.problem.solution.medium;

import com.leetcode.problem.solution.common.ListNode;

import java.util.List;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(7);


        oddEvenList(head);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode lastOddNode = head;

        boolean sizeListEven = true;
        ListNode post = null;

        while (odd != null) {

            lastOddNode = odd;
            post = odd.next;

            if(post != null && post.next != null){
                lastOddNode.next = post.next;
            }
            else{
                lastOddNode.next = null;
                break;
            }

            sizeListEven= !sizeListEven;
            odd = post;

        }

        if(sizeListEven){
            lastOddNode.next = even;
        }
        else{
            post.next = even;
        }

        return head;
    }

}
