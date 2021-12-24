package cn.niudehua.designpartten.abstractfactory.single;

import java.util.concurrent.TimeUnit;

/**
 * @author deng
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
