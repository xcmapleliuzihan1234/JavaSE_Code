package com.itheima.lambda03;

public class Test {
    public static void main(String[] args) {
        Sum sum = new Sum() {
            @Override
            public int num(int a, int b) {

                return a + b;
            }
        };
        System.out.println(sum.num(4, 6));


        Sum sum1 = (int a, int b) -> {
            return a * b;
        };
        System.out.println(sum1.num(4, 6));
    }

}

interface Sum {
    int num(int a, int b);
}