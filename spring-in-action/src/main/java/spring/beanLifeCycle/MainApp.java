package spring.beanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 */

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean_life_cycle/spring-context.xml");

        IUserService service = (IUserService) context.getBean("userService1");
        System.out.println(service.generateUserID());
        context.close();
    }
}
