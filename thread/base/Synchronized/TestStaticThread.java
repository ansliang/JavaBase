package java_base.thread.base.Synchronized;

public class TestStaticThread {
    public static void main(String[] args) {
        StaticTrans staticTrans1=new StaticTrans();
        StaticTrans staticTrans2=new StaticTrans();
        Thread t1=new Thread(new StaticThread1(1,staticTrans1));
        Thread t2=new Thread(new StaticThread2(2,staticTrans2));
        t1.start();
        t2.start();
    }
}
