package cn.niudehua.designpartten.abstractfactory.single;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 类名称：RedisUtils
 * ***********************
 * <p>
 * 类描述：redis单机服务
 *
 * @author deng on 2020/12/22 15:21
 */
public class RedisUtils {

    private final Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String get(String key) {
        System.out.printf("Redis获取数据 key：%s%n", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        System.out.printf("Redis写入数据 key：%s val：%s%n", key, value);
        dataMap.put(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.printf("Redis写入数据 key：%s val：%s timeout：%s timeUnit：%s%n", key, value, timeout, timeUnit.toString());
        dataMap.put(key, value);
    }

    public void del(String key) {
        System.out.printf("Redis删除数据 key：%s%n", key);
        dataMap.remove(key);
    }


}