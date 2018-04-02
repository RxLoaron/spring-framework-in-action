package spring.aop.aspectj;

/**
 * Created by lyp3314@gmail.com on 2017/11/1.
 */

public class HelloAspect {
    public static void main(String args[]) {
        HelloAspect helloWord = new HelloAspect();
        helloWord.sayHello();
    }

    public void sayHello() {
        System.out.println("hello world !");
    }
}
