package cn.niudehua.designpartten.abstractfactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author deng
 */
public class JDKProxy {
    private JDKProxy() {
    }

    /**
     * 获取代理对象
     *
     * @param interfaceClass 接口对象
     * @param cacheAdapter   适配器
     * @param <T>            泛型对象
     * @return 代理对象
     */
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        //noinspection unchecked
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }

}
