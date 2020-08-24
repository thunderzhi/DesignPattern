import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/24 19:33
 */
public   class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance = null;

    public static synchronized Singleton2 getInstance() {
        if (instance==null){
            instance = new Singleton2();
        }
        return instance;
    }
}
