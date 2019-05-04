package java_base.thread.base.Synchronized;

public class NormalThread implements Runnable {
    private int num;
    private Trans trans;
    public  NormalThread(int num,Trans trans){
        this.num=num;
        this.trans=trans;
    }
    public void run() {
        while (true){
            this.trans.printNum(num);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        Trans trans=new Trans();
//        Thread t1=new Thread(new NormalThread(1,trans));
//        Thread t2=new Thread(new NormalThread(2,trans));
//        t1.start();
//        t2.start();
        //测试不同的对象
        Trans trans1=new Trans();
        Trans trans2=new Trans();
        Thread t1=new Thread(new NormalThread(1,trans1));
        Thread t2=new Thread(new NormalThread(2,trans2));
        t1.start();
        t2.start();

    }
}
