package java_base.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainFunction {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/demo?useSSL=false&useUnicode=" +
            "true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    public static void main(String[] args) {
       try{
           //加载驱动
           Class.forName(JDBC_DRIVER);
           //获取连接对象
           Connection conn= DriverManager.getConnection(DB_URL,"root","login");
           Statement stmt=conn.createStatement();
           //书写基本的sql
           String sql="select * from user";
           ResultSet rs=stmt.executeQuery(sql);
           while (rs.next()){
               System.out.println(rs.getString("userid")+","+rs.getString("username")+","+rs.getString("userage"));
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
