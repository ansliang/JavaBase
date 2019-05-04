package java_base.reflaction;

/**
 * @author anner
 * @date 2019/5/4 11:21
 * 获取Class对象三种方法
 */
public class TestGetClass {
    public static void main(String[] args) throws Exception{
        Class c1=Class.forName("java_base.reflaction.Person");
        Class c2=new Person().getClass();
        Class c3=Person.class;
    }
}
