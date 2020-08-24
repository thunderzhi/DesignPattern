/**
 * @author cxz
 * @Title:
 * @Package
 * @Description: DCL double lock checking
 * @date 2020/8/24 19:33
 */
public   class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 instance ;

    public static  Singleton3 getInstance() {

        if (instance==null){
            synchronized(Singleton3.class){
                if (instance==null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
