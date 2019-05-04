package java_base.thread.base.Synchronized;

public class BlockThread implements Runnable {
    private int num;
    private BlockTrans blockTrans;

    public BlockThread(int num, BlockTrans blockTrans) {
        this.num = num;
        this.blockTrans = blockTrans;
    }

    public void run() {
        while (true){
            blockTrans.printNum(num);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
