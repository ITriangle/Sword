package com.wangl;

import org.junit.Test;

/**
 * Created by seentech on 2016/12/27.
 */
public class Solution3 {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" " , "%20");

    }

    @Test
    public void test() {
        StringBuffer str = new StringBuffer("WE ARE HAPPY");


        System.out.println(replaceSpace(str));
    }
}
