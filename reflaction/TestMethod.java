package java_base.reflaction;

import java.lang.reflect.Method;

/**
 * @author anner
 * @date 2019/5/4 11:37
 * 测试获取对象的成员方法
 */
public class TestMethod {
    
    public static void main(String[] args) {
        try{
            //获取class对象
            Person p=new Person("anner","login",20,181,true,"whut");
            Class c=p.getClass();
            //获取全部的方法
            Method []methods=c.getDeclaredMethods();
            //遍历全部的方法
            for(Method m:methods){
                System.out.print("方法名:"+m.getName());
                //获取全部的参数对象
                Class []paramterTypes=m.getParameterTypes();
                for(Class parameter:paramterTypes){
                    System.out.print("参数类型:"+parameter.getName());
                }
                //获取返回类型
                Class returnType=m.getReturnType();
                System.out.println("返回类型为:"+returnType.getName());
            }

            //调用非静态方法
            Method m1=c.getDeclaredMethod("setUsername",String.class);
            m1.invoke(p,"wjs");
            Method m2=c.getDeclaredMethod("getUsername");
            System.out.println("调用非静态方法，获取name="+m2.invoke(p));
            //调用静态方法
            Method m3=c.getDeclaredMethod("testStaticMethod", String.class);
            m3.invoke(null,"anner");
            //调用私有方法
            Method m4=c.getDeclaredMethod("testPrivateMethod", String.class);
            m4.setAccessible(true);
            m4.invoke(p,"anner");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
