import com.caucho.hessian.client.HessianProxyFactory;
import com.daisy.base.IRcpHello;

import java.net.MalformedURLException;

/**
 * @Name PACKAGE_NAME.ClientTest
 * @Description
 * @Author qianna
 * @Version 2017/5/4 17:18
 * @Copyright 上海云辰信息科技有限公司
 */
public class ClientTest {
    public static String url = "http://127.0.0.1:8282/hessianServer/remoting/hello";

    public static void main(String[] args) {
        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            IRcpHello rcpHello = (IRcpHello) factory.create(IRcpHello.class,url);
            System.out.println(rcpHello.sayHello("client"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
