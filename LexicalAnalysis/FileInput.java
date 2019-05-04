package LexicalAnalysis;


import java.io.*;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

//处理输入流
public class FileInput {
    private String filePath;

    //构造函数
    public FileInput(String filePath){
        this.filePath=filePath;
    }

    //输入流转换为list输出
    public List<String>file2list(){
        List<String>list=new ArrayList<>();
        try{
            BufferedReader br=new BufferedReader(new FileReader(filePath));
            String line=null;
           while ((line=br.readLine())!=null){
               line=line.trim();
               String []word=line.split(" ");
               for (String str:word) list.add(str);
           }

        }catch (Exception e){
            System.out.println("输入流转换失败");
        }
        return list;
    }


}
