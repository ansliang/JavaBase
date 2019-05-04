package java_base.reflaction;

/**
 * @author anner
 * @date 2019/5/4 11:03
 * 测试反射机制的一个基础测试类
 */
public class Person {
    private String username;
    private String password;
    public int userage;
    public long number;
    private boolean isVIP;
    protected String address;

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userage=" + userage +
                ", number=" + number +
                ", isVIP=" + isVIP +
                ", address='" + address + '\'' +
                '}';
    }

    public Person(String username, String password, int userage, long number, boolean isVIP, String address) {
        this.username = username;
        this.password = password;
        this.userage = userage;
        this.number = number;
        this.isVIP = isVIP;
        this.address = address;
    }

    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getUserage() {
        return userage;
    }

    public long getNumber() {
        return number;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public String getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void testStaticMethod(String name){
        System.out.println("hello "+name);
    }
    //测试私有方法
    private void testPrivateMethod(String name){
        System.out.println("hold on "+name);
    }
}
