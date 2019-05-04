package LexicalAnalysis;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式匹配java中的词法
public class RExpression {
    // 关键字
    private static String [] keyWord={"private","protected","public","abstract","class","extends","final","implements","interface","native","new","static","strictfp","synchronized","transient","volatile","break","case","continue","default","do","else","for","if","instanceof","return","switch","while","assert","catch","finally","throw","throws","try","import","package","boolean","byte","char","double","float","int","long","short","null","super","this","void","goto","const"};
    //运算符
    private static String[] operator={"+","-","*","/","%","++","--","==","!=",">","<",">=","<=","&","|","^","~","<<",">>",">>>","&&","||","!","=","+=","-=","*=","/=","%=","<<=",">>=","&=","^=","|="};
    //界限符
    private static String []boundary={"{","}","(",")","[","]","<",">",";"};
    private static String []boundaryPattern={"\\{","}","\\(","\\)","\\[","]","<",">",";"};
    //无符号数的正规式
    private static String number="^[0-9]*$";
    //标识符的正规式

    private  static Map<String,String>map=new HashMap<>();

    private static Iterator<String> iterator;
    private static List<String>words;

    public RExpression(List<String> words){
        this.words=words;
        reset();
    }
    private void reset(){
        iterator=words.iterator();
    }
    //初始化map
    private void initMap(){
        while (iterator.hasNext()){
            map.put(iterator.next(),"null");
        }
    }
    public void printMap(){

    }
    //将初始的元素分片
    private void splitWords(){

    }

    private List<String> getWordsByPattern(String []patterns){
        List<String>answer=new ArrayList<>();
        int index=0;
        //使用list中的元素作为正则表达式
        for (String pattern:patterns){
            Pattern r=Pattern.compile(pattern);
            while (iterator.hasNext()){
                String str=iterator.next();
                Matcher m=r.matcher(str);
                if (m.find()){
                    System.out.println(str+"  "+m.group());
//                    answer.add(m.group(0));
//                    str=str.replaceAll(pattern,"");
//                    iterator.remove();
                }
            }
            reset();
        }
        return null;
    }
    //测试
    public void printList(){
        while (iterator.hasNext())System.out.println(iterator.next());
    }
    //提取全部的关键字
    public  List<String> getKeyWords(){
        List<String>keywords=new ArrayList<>();

        while (iterator.hasNext()){
            String str=iterator.next();
            if (Arrays.asList(this.keyWord).contains(str)){
                keywords.add(str);
                iterator.remove();
            }
        }
        reset();
        return  keywords;
    }
    //提取全部的界限符
    public  List<String> getBoundarys(){
        List<String>boundarys=new ArrayList<>();
        List<Integer>index=new ArrayList<>();
        while (iterator.hasNext()){
            String str=iterator.next();
            if (Arrays.asList(this.boundary).contains(str)){
                boundarys.add(str);
                iterator.remove();

            }
        }
        reset();
        return boundarys;
    }


    //提取全部的运算符



    public List<List<String>> run(){

        List<List<String>>answer=new ArrayList<>();
        //关键字
        answer.add(getKeyWords());
        //运算符
        answer.add(getBoundarys());

        //getWordsByPattern(boundaryPattern);
        printList();

        return answer;
    }

}