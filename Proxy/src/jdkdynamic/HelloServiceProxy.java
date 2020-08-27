package jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/26 10:54
 */
public class HelloServiceProxy implements InvocationHandler {
    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("************* This is JDK Dynamic Proxy ***********");
        Object result = null;
        System.err.println("ready say hello.");
        result = method.invoke(target, args);
        System.err.println("saied hello.");

        return result;
    }


}
