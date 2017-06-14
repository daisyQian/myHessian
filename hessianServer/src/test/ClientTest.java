import com.caucho.hessian.client.HessianProxyFactory;
import com.daisy.demo.IHello;

import java.net.MalformedURLException;

/**
 * @Name PACKAGE_NAME.ClientTest
 * @Description
 * @Author qianna
 * @Version 2017/5/4 17:18
 * @Copyright 上海云辰信息科技有限公司
 */
public class ClientTest {
    public static String url = "http://127.0.0.1:8282/hessianServer/Hello";

    public static void main(String[] args) {
        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            IHello iHello = (IHello) factory.create(IHello.class,url);
            System.out.println(iHello.sayHello());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
