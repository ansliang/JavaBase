package java_base.thread.base.Synchronized;

public class DoubleThread2 implements Runnable {
    private int num;
    private DoubleTrans doubleTrans;

    public DoubleThread2(int num, DoubleTrans doubleTrans) {
        this.num = num;
        this.doubleTrans = doubleTrans;
    }

    public void run() {
        while (true){
            doubleTrans.printNum2(num);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
