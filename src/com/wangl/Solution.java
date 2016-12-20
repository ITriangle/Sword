package com.wangl;

/**
 * Created by seentech on 2016/12/20.
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }
        else if(target == 2){
            return 2;
        }
        else{
            return JumpFloor(target - 1) + JumpFloor(target -2);
        }

    }

    public static void main(String [] args){
        com.wangl.Solution solution = new com.wangl.Solution();
        System.out.println(solution.JumpFloor(3));
    }
}
