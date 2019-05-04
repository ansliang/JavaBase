package java_base.thread.base.Synchronized;

public class TestBlockThread {
    public static void main(String[] args) {
        BlockTrans blockTrans1=new BlockTrans();
        BlockTrans blockTrans2=new BlockTrans();
        Thread t1=new Thread(new BlockThread(1,blockTrans1));
        //Thread t2=new Thread(new BlockThread(2,blockTrans2));
        Thread t2=new Thread(new BlockThread(2,blockTrans1));
        t1.start();
        t2.start();
    }
}
