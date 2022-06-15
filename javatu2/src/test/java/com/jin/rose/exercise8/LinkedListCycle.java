package com.jin.rose.exercise8;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    //has O(n) efficiency)
    public boolean hasCycle(ListNode head){
        Set<ListNode> cycle = new HashSet<>();
        while(head.next != null){
            if(cycle.contains(head)){
                return true;
            }
            cycle.add(head);
            head = head.next;
        }
         return false;
    }

    //utilizing tortoise hare method aka usain bolt v me
    public boolean hasCycle2(ListNode head){
        ListNode hare = head;
        ListNode tortoise = head;

        while (hare.next.next != null && hare.next !=null){
            hare = hare.next.next;
            tortoise = head.next;

            if (hare == tortoise){
                return true;
            }
        }

        return false;
    }


}
