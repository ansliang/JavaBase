package java_base.reflaction;

import java.lang.reflect.Constructor;

/**
 * @author anner
 * @date 2019/5/4 11:09
 * 获取对象的全部构造方法
 */
public class TestConstructor {
    public static void main(String[] args) {
        String className="java_base.reflaction.Person";
       try {
           Class c=Class.forName(className);
           //获取全部的构造函数对象
           Constructor []constructors=c.getDeclaredConstructors();
           //打印对应的信息
           for(Constructor constructor:constructors){
               System.out.print("构造函数:"+constructor.getName()+" 参数类型: ");
               Class []paramtypes=constructor.getParameterTypes();
               for(Class param:paramtypes){
                   System.out.print(param.getName()+" , ");
               }
               System.out.println();
           }
           //调用构造函数构造信息
           Constructor constructor=c.getConstructor(String.class,String.class,int.class,long.class,boolean.class,String.class);
           Person p= (Person) constructor.newInstance("anner","123",20,181,true,"whut");
           System.out.println(p.toString());
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
