package java_base.thread.base.Synchronized;

public class StaticThread1 implements Runnable {
    public int num;
    public StaticTrans staticTrans;

    public StaticThread1(int num, StaticTrans staticTrans) {
        this.num = num;
        this.staticTrans = staticTrans;
    }

    public void run() {
      while (true){
          staticTrans.printNum1(num);
          try{
              Thread.sleep(500);
          }catch (InterruptedException e){
              e.printStackTrace();
          }
      }
    }
}
