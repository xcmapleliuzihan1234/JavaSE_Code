package com.itheima.interfaceDemo;

public class DemoImp1 implements InterfaceDemo1 {
    @Override
    public void sleep() {
        System.out.println("˯ɳ��");
    }
}
class Test{
    public static void main(String[] args) {
       DemoImp1 di = new DemoImp1();
      di.sleep();
    }
}
