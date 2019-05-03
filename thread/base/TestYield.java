package java_base.thread.base;

public class TestYield implements Runnable {
    private String name;
    public TestYield(String name){
        this.name=name;
    }
    public void run() {
       for(int i=0;i<50;i++){
           System.out.println(name+"运行"+i+"-------");
           if (i==30)Thread.yield();
       }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new TestYield("A"));
        Thread t2=new Thread(new TestYield("B"));
        t1.start();
        t2.start();
    }
}
