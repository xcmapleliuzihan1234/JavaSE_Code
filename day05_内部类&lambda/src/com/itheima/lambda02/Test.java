package com.itheima.lambda02;

interface StringHendler {
    void printMessage(String msg);
}
public class Test{
    public static void main(String[] args) {
        StringHendler stringHendler = new StringHendler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("����Ϣ��" + msg);
            }
        };
        stringHendler.printMessage("�ϵ�");

        StringHendler   stringHendler1 = (String msg) -> {
            System.out.println("����Ϣ" + msg);
        };
        stringHendler1.printMessage("����");
    }
}