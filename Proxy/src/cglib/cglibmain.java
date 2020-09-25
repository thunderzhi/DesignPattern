package cglib;

import jdkdynamic.HelloServiceProxy;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/27 20:01
 */
public class cglibmain {
    public static void main(String[] args) {
        HelloServiceImpl helloHandler = new HelloServiceImpl();

        HelloServiceCglib helloServiceCglib = new HelloServiceCglib();
        Object instance = helloServiceCglib.getInstance(helloHandler);

    }
}
