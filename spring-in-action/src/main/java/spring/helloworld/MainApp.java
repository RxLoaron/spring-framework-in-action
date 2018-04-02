package spring.helloworld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by lyp3314@gmail.com on 2017/6/21.
 */

public class MainApp {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext creates Spring Application Context accepting input as configuration
        // class annotated
        // with @Configuration
//        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        IHelloWorld helloWorld = (IHelloWorld) context.getBean("helloworld");
//        helloWorld.sayHello("Spring 4");
//


//        //XML based configuration
//        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
//        IHelloWorld helloWorld1 = (IHelloWorld) xmlContext.getBean("helloworld");
//        helloWorld1.sayHello("Spring 4,from xml...");
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
        IHelloWorld helloWorld1 = (IHelloWorld) bf.getBean("helloworld");
        helloWorld1.sayHello("Spring 4,from BeanFactory...");

//        ClassPathResource resource = new ClassPathResource("spring-context.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(resource);
//        IHelloWorld helloWorld = (IHelloWorld) factory.getBean("helloworld");
//        helloWorld.sayHello("hello xmlbeanfactory...");


//        ClassPathResource resource = new ClassPathResource("spring-context.xml");
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(resource);
//        IHelloWorld helloWorld = (IHelloWorld) factory.getBean("helloworld");
//        helloWorld.sayHello("programing");
    }
}
