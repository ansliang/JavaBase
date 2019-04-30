package java_base.jdbc;

public class User {
    private long userid;
    private String username;
    private int userage;

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public long getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public int getUserage() {
        return userage;
    }

    public User() {
    }

    public User(long userid, String username, int userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }
}
