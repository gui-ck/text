package com.gui.work4th.Lv1;

import com.gui.work4th.Tools;

import java.util.Scanner;

public class Textmain {
    public static void main(String[] args) {
        int n;
        System.out.println("输入n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Tools tool = new Tools();
//计算n项的累加
        long sumer;
        sumer = tool.sum(n);
        System.out.println(n+"项的累加为"+sumer);
//计算fibonacci数列的第n项
        long m;
        m = tool.fibo(n);
        System.out.println("fibonacci数列第"+n+"项为"+m);
//计算n的阶乘
        long a;
        a = tool.fact(n);
        System.out.println(n+"的阶乘为："+a);
    }
}
