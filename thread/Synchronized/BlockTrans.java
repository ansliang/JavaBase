package java_base.thread.base.Synchronized;

public class BlockTrans {
    private Object lock=new Object();
    public void printNum(int num){
        synchronized (lock){
            System.out.println(lock.toString());
            for(int i=0;i<25;i++)System.out.print(i+" ");
            System.out.println();
        }
    }
}
