package java_base.thread.base.Synchronized;

public class DoubleThread3 implements Runnable {
    private int num;
    private DoubleTrans doubleTrans;

    public DoubleThread3(int num, DoubleTrans doubleTrans) {
        this.num = num;
        this.doubleTrans = doubleTrans;
    }

    public void run() {
        while (true){
            doubleTrans.printNum3(num);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
