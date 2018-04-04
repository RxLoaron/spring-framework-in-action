package spring.helloworld;

import org.springframework.context.annotation.Configuration;

/**
 * Created by lyp3314@gmail.com on 2017/6/21.
 */

@Configuration
public class HelloWorldConfig {

    // @Configuration注释 告知 Spring 容器这个类是一个拥有 bean 定义和依赖项的配置类。
    // @Bean 注释用于定义 bean。方法名称与 bean id 或默认名称相同。

    //@Bean(value = "helloworld")
    //@Description("A HelloWorld Bean")
    public IHelloWorld beanHelloWorld() {
        return new HelloWorldImpl();
    }
}
