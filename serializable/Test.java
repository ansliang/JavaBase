package serializable;

import java.io.*;

public class Test {
    public static void main(String []args) throws IOException, ClassNotFoundException {
        //序列化
        OutputStream op=new FileOutputStream("a.txt");
        ObjectOutputStream ops=new ObjectOutputStream(op);
        ops.writeObject(new person("anner",18));
        ops.close();
        //反序列化
        InputStream in=new FileInputStream("a.txt");
        ObjectInputStream os=new ObjectInputStream(in);
        byte []buffer=new byte[10];
        int len=-1;
        person p=(person) os.readObject();
        System.out.println(p.getName());
        os.close();
    }
}
