package com.itheima.innerDemo1;

public class Computer {
    int a = 10;

    class Cpu{
        int a = 20;
        public void method(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            Computer computer = new Computer();
            System.out.println(computer.a);

            //²¹³ä·½·¨
            System.out.println(Computer.this.a);

        }
    }
}
