package com.wangl;

import org.junit.Test;

/**
 * Created by seentech on 2016/12/27.
 */
public class Solution2 {
    public boolean Find(int target, int[][] array){
        int row = array.length;
        int col = array[0].length;

        System.out.println(row);
        System.out.println(col);

        int compareRow = 0;
        int compareCol = col - 1;
        while(compareRow < row && compareCol >= 0) {
            if(target > array[compareRow][compareCol]) {
                compareRow++;
            }
            else if(target < array[compareRow][compareCol]) {
                compareCol--;
            }
            else{
                return true;
            }

        }

        return false;
    }

    @Test
    public void testFind(){
        int[][] array={
                {1,2,3,4,5},
                {6,7,8,9,10}
        };

        System.out.println(Find(9,array));

    }

}
