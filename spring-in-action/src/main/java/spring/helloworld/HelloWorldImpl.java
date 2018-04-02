package spring.helloworld;

/**
 * Created by lyp3314@gmail.com on 2017/6/21.
 */

class HelloWorldImpl implements IHelloWorld {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name + "...");
    }
}
