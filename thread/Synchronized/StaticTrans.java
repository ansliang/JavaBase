package java_base.thread.base.Synchronized;

public class StaticTrans {
    //加锁的静态方法，类中所有的对象均无法同时访问
    public static synchronized void printNum1(int num){
        System.out.println("静态加锁方法:");
        for(int i=0;i<25;i++)System.out.print(i+" ");
        System.out.println();
    }
    //普通方法加锁方法
    public synchronized void printNum2(int num){
        System.out.println("普通加锁方法...");
        for(int i=0;i<25;i++)System.out.print(i+" ");
        System.out.println();
    }
}
