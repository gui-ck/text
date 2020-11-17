package com.gui.work4th;

public class Tools {
    //计算n的阶乘
    public long fact(int n) {
        long ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }

    //fibonacci的第n项
    public long fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else
            return (fibo(n - 1) + fibo(n - 2));
    }
    //累加到第n项的值
    public long sum(int n){
        long sum = 0;
        for (int i = 1; i <=n ; i++) {
             sum += i;
        }
        return sum;
    }
}
