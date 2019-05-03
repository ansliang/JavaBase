package java_base.thread.base.Synchronized;

public class DoubleThread1 implements Runnable {
    private int num;
    private DoubleTrans doubleTrans;

    public DoubleThread1(int num, DoubleTrans doubleTrans) {
        this.num = num;
        this.doubleTrans = doubleTrans;
    }

    public void run() {
        doubleTrans.printNum1(num);
    }
}
