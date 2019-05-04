package java_base.thread.base.Synchronized;

public class TestDoubleThread {
    public static void main(String[] args) {
        //只存在一个对象
        DoubleTrans doubleTrans=new DoubleTrans();
        Thread t1=new Thread(new DoubleThread1(1,doubleTrans));
        Thread t2=new Thread(new DoubleThread2(1,doubleTrans));
        Thread t3=new Thread(new DoubleThread3(1,doubleTrans));
        t1.start();
        t2.start();
        t3.start();
    }
}
