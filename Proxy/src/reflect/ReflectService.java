package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/26 10:32
 */
public class ReflectService {
    public void sayHello(String name){
        System.out.println("hello"+name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object service = Class.forName(ReflectService.class.getName()).newInstance();

        Method method = service.getClass().getMethod("sayHello", String.class);
        method.invoke(service,"jerry");
    }
}
