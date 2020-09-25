package jdkdynamic;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/26 11:00
 */
public class HelloServiceMain {
    public static void main(String[] args) {
        HelloServiceProxy helloHandler = new HelloServiceProxy();
        HelloService proxy =  (HelloService)helloHandler.bind(new HelloServiceImpl());
        proxy.sayHello(" hhhhhh");

    }
}
