package cn.kgc.itrip.biz.controller;

import java.util.Scanner;

/**
 * @author 韩宏伟
 * 类名： Test.java
 * 创建时间： 2019/10/14 11:16
 * @version 1.0
 */


public class Test {

    public static void main(String[] args) {
        // 外层循环执行一次
        int[] scores = {12,32,43,12,32};
        int score = 90;
        int num = 0;
        for (int i = 0; i < 10; i++) {
            if (num == 3){
                break;
            }
            num++;
        }
    }
}

