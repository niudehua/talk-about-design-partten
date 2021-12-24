package cn.niudehua.designpartten.abstractfactory;

import java.util.concurrent.TimeUnit;

/**
 * @author deng
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
