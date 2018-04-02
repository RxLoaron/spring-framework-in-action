package spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 */

public class MainApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "jdbctemplate/spring-context.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);

        System.out.println("user count:" + userDao.getUserCount());
        System.out.println(userDao.getUserById(6));

    }
}
