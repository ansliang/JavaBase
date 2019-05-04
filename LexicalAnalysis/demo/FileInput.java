package LexicalAnalysis.demo;


import java.io.BufferedReader;
import java.io.FileReader;
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
    public String file2list(){
        List<String>list=new ArrayList<>();
        StringBuffer strbuf=new StringBuffer();
        try{
            BufferedReader br=new BufferedReader(new FileReader(filePath));
            String line=null;
           while ((line=br.readLine())!=null){
               strbuf.append(line);
           }

        }catch (Exception e){
            System.out.println("输入流转换失败");
        }

        return new String(strbuf);
    }


}
