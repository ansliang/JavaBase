package socket.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//多线程类
public class server implements Runnable{
    private Socket client=null;
    public server(Socket client){
        this.client=client;
    }

    @Override
    public void run(){
        try{
            //获取输出流
            PrintStream out=new PrintStream(client.getOutputStream());
            //获取输入流
            BufferedReader buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag=true;
            while (flag){
                String str=buf.readLine();
                if (str==null||"".equals(str)){
                    flag=false;
                }else{
                    if (str.equals("bye")){
                        flag=false;
                    }else{
                        out.println("echo "+str);
                    }
                }
            }
            out.close();
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
