package java_base.thread.base;

public class TestJoin implements Runnable {
    private String name;
    public TestJoin(String name){
        this.name=name;
    }
    //正常的使用多线程方法
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(name+"运行 "+i);
            try{
                Thread.sleep((int)Math.random()*10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new TestJoin("A"));
        Thread t2=new Thread(new TestJoin("B"));
        t1.start();
        t2.start();
        try{
            t1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("主线程运行结束");
    }
}
