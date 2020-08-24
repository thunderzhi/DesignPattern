/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2020/8/24 19:33
 */
public   class Singleton1 {
    private Singleton1() {
    }
    private static Singleton1 instance = null;
    public static Singleton1 getInstance() {
        if (instance==null){
            instance = new Singleton1();
        }
        return instance;
    }
 
}
