package cn.niudehua.designpartten.abstractfactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 类名称：EGM
 * ***********************
 * <p>
 * 类描述：模拟EGM集群
 *
 * @author deng on 2020/12/22 20:44
 */
public class EGM {

    private final Map<String, String> dataMap = new ConcurrentHashMap<>();

    public String gain(String key) {
        System.out.printf("EGM获取数据 key：%s%n", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        System.out.printf("EGM写入数据 key：%s val：%s%n", key, value);
        dataMap.put(key, value);
    }

    public void setEx(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.printf("EGM写入数据 key：%s val：%s timeout：%s timeUnit：%s%n", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void delete(String key) {
        System.out.printf("EGM删除数据 key：%s%n", key);
        dataMap.remove(key);
    }

}