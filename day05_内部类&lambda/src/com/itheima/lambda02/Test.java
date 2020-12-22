package com.itheima.lambda02;

interface StringHendler {
    void printMessage(String msg);
}
public class Test{
    public static void main(String[] args) {
        StringHendler stringHendler = new StringHendler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("发信息给" + msg);
            }
        };
        stringHendler.printMessage("老弟");

        StringHendler   stringHendler1 = (String msg) -> {
            System.out.println("发信息" + msg);
        };
        stringHendler1.printMessage("老妹");
    }
}