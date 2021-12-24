package cn.niudehua.designpartten.abstractfactory.app;

import cn.niudehua.designpartten.abstractfactory.EGMCacheAdapter;
import cn.niudehua.designpartten.abstractfactory.IIRCacheAdapter;
import cn.niudehua.designpartten.abstractfactory.JDKProxy;
import cn.niudehua.designpartten.abstractfactory.single.CacheService;
import cn.niudehua.designpartten.abstractfactory.single.CacheServiceImpl;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/22 21:47
 */
public class App {
    public static void main(String[] args) {
        CacheService proxyEGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxyEGM.set("user_name_01", "小傅哥");
        String val01 = proxyEGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxyIIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxyIIR.set("user_name_01", "小傅哥");
        String val02 = proxyIIR.get("user_name_01");
        System.out.println("测试结果：" + val02);

    }
}