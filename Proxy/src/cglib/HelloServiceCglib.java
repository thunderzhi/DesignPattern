package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/27 19:50
 */
public class HelloServiceCglib implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target){
        this.target =target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return  enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.err.println("************** this is CGLIB proxy *****************");
        System.err.println("ready say");
        Object returnobj    = methodProxy.invokeSuper(o, objects);
        System.err.println(" said  say");
        return returnobj;
    }




}
