package LexicalAnalysis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String []args){
        FileInput fileInput=new FileInput("C:\\Users\\anner\\Desktop\\test.java");
        List<String>words=fileInput.file2list();

        List<String>clone=new ArrayList<>();
        for(String str:words)clone.add(str);

        RExpression r=new RExpression(words);
        List<List<String>>list=r.run();
        //关键字
        //List<String>keywords=list.get(0);
        //界限符
        //List<String>boundarys=list.get(1);
//        for(String str:clone){
//            str=str.trim();
//            if (keywords.contains(str)){
//                System.out.println(str+"   关键字");
//            }
//            if (boundarys.contains(str)){
//                System.out.println(str+"   界限符");
//            }
//        }

    }
}
