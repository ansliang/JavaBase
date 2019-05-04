package java_base.thread.base.Synchronized;

public class DoubleTrans {
    //同步方法，无限循环，理论上其他的同步方法永远不会被执行
    public synchronized void printNum1(int num){
        while (true){
            System.out.print("同步方法1..");
            for(int i=0;i<25;i++){
                System.out.print(i+" ");
            }
            System.out.println();
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    //同步方法
    public synchronized void printNum2(int num){
        System.out.print("同步方法2..");
        for(int i=0;i<25;i++){
            System.out.print(i+" ");
        }
    }
    //普通方法
    public void printNum3(int num){
        System.out.print("普通方法...");
        for(int i=0;i<25;i++)System.out.print(i+" ");
    }
}
