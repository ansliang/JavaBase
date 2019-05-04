package java_base.autoboxing;

public class TestInteger {
    public static void main(String[] args) {
        Integer num1=new Integer(1);
        Integer num2=new Integer(1);
        int num3=1;
        Integer num4=1;
        System.out.println(num1==num4);

        Integer test1=127;
        Integer test2=127;
        System.out.println(test1==test2);
        Integer test3=128;
        Integer test4=128;
        System.out.println(test3==test4);
    }
}
