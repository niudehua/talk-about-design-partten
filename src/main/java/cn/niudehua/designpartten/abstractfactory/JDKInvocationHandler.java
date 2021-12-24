package cn.niudehua.designpartten.abstractfactory;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author deng
 */
public class JDKInvocationHandler implements InvocationHandler {

    private final ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }

}
