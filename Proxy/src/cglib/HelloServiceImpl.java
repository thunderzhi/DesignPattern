package cglib;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/26 10:52
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }
}
