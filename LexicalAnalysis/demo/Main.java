package LexicalAnalysis.demo;

public class Main {
    public static void main(String []args){
        String filePath="C:\\Users\\anner\\Desktop\\by.cpp";
        String text=new FileInput(filePath).file2list();
        TextLex textLex=new TextLex(text);
        textLex.scannerAll();

    }
}
