package java_base.thread.base.Synchronized;

public class StaticThread2 implements Runnable {
    private int num;
    private StaticTrans staticTrans;

    public StaticThread2(int num, StaticTrans staticTrans) {
        this.num = num;
        this.staticTrans = staticTrans;
    }

    public void run() {
        while (true){
            staticTrans.printNum2(num);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
