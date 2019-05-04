package java_base.reflaction;

import java.lang.reflect.Field;

/**
 * @author anner
 * @date 2019/5/4 15:13
 * 测试反射中的成员变量
 */
public class TestField {
    public static void main(String[] args) {
        //获取class对象
        Person p=new Person("anner","login",20,181,true,"whut");
        Class c=p.getClass();
        //获取全部的变量
        Field []fields=c.getDeclaredFields();
        //遍历输出全部的变量
        for(Field field:fields){
            System.out.println("变量名:"+field.getName()+",变量类型:"+field.getType().getName());
        }
       try{
           //获取变量的具体值
           for(Field field:fields){
               field.setAccessible(true);
               System.out.println(field.getName()+"=="+field.get(p));
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
