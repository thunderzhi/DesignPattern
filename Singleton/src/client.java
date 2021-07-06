/**
 * @author cxz
 * @Title:
 * @Package
 * @Description:
 * @date 2021/7/6 10:26
 */
public class client {

    public static volatile  test  obj = null  ;

    public static test getObjInstance(){
        if (obj==null){

            synchronized (client.class){
                if (obj==null){
                    obj = new test("ttttt");

                }
            }
        }
        return obj;
    }

    public static test getObj(){
        return getObjInstance();
    }
}
