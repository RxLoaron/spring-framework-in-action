package spring.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by lyp3314@gmail.com on 2017/9/11.
 *
 * 实现了InitializingBean, DisposableBean接口，同时在xml配置中设置了init和destroy
 *
 * 执行顺序为 afterPropertiesSet > init(xml) > destroy(DisposableBean接口) >destroy(xml)
 *
 * 不建议使用InitializingBean和DisposableBean的接口，因为它将代码紧耦合到 Spring 代码中。 一个更好的做法应该是在bean的配置文件属性指定 init-method和destroy-method
 */

public class UserServiceImp implements IUserService, InitializingBean, DisposableBean {
    @Override
    public long generateUserID() {
        return System.currentTimeMillis();
    }

    public void init() {
        System.out.println("init...");
    }

    public void cleanUp() {
        System.out.println("cleanUp...");
    }

    //通常InitializingBean接口的使用是能够被避免的，（不鼓励使用，因为没有必要把代码通Spring耦合起来） Bean的定义支持指定一个普通的初始化方法，在使用XmlBeanFactory的情况下，可以通过指定init-method属性来完成
    //afterPropertiesSet()表示在资源加载完以后，初始化bean之前执行的方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("UserService afterPropertiesSet...");
    }


    //对于 Bean 实现了DisposableBean，它将运行 destroy()在 Spring 容器释放该 bean 之后
    @Override
    public void destroy() throws Exception {
        System.out.println("UserService destroy...");
    }
}
