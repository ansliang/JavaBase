package java_base.thread.base.Synchronized;

public class Trans {
    public synchronized void printNum(int num){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<25;i++)System.out.print(i+" ");
        System.out.println();
    }
}
