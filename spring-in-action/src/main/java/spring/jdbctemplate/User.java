package spring.jdbctemplate;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 */

public class User {
    private String name;
    private String email;
    private int sex;

    public User(String name, String email, int sex) {
        this.name = name;
        this.email = email;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                '}';
    }
}
