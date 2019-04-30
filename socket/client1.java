package socket.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class client1 {
    public static  void main(String []args) throws  Exception{
        //建立TCP连接
        Socket client=new Socket("127.0.0.1",20006);
        client.setSoTimeout(10000);
        //获取键盘输入
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        //获取socket的输出流
        PrintStream out=new PrintStream(client.getOutputStream());
        //获取socket的输入流
        BufferedReader buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
        boolean flag=true;
        while (flag){
            System.out.print("输入信息:");
            String str=input.readLine();
            //发送数据到服务器
            out.println(str);
            if ("bye".equals(str)){
                flag=false;
            }else{
                //获取服务器数据
                String echo=buf.readLine();
                System.out.println(echo);
            }
        }
        input.close();
        if (client!=null){
            //只关闭socket，其关联的输入输出流也会被关闭
            client.close();
        }
    }
}
