package socket.tcp;

import java.net.ServerSocket;
import java.net.Socket;

public class Test {
    public static  void main(String []args)throws  Exception{
        ServerSocket s=new ServerSocket(20006);
        Socket client=null;
        boolean f=true;
        while(f){
            //等待客户端连接
            client=s.accept();
            System.out.println("与客户端连接成功");
            //开启一个线程
            new Thread(new server(client)).start();
        }
        s.close();
    }
}
