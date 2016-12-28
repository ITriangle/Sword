package com.wangl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by seentech on 2016/12/27.
 */
public class Solution5 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null){
            stack.push(listNode.value);
            listNode = listNode.next;
        }

        while(!stack.empty()){
            arrayList.add(stack.peek());
            stack.pop();
        }

        return arrayList;
    }

    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;

        ArrayList<Integer> arrayList = printListFromTailToHead(listNode1);


    }
}

class ListNode{
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value;
    }
}
