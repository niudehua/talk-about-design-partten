package cn.niudehua.designpartten.abstractfactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * 类名称：IIR
 * ***********************
 * <p>
 * 类描述：IIR集群
 *
 * @author deng on 2020/12/22 20:41
 */
public class IIR {


    private final Map<String, String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key) {
        System.out.printf("IIR获取数据 key：%s%n", key);
        return dataMap.get(key);
    }

    public void set(String key, String value) {
        System.out.printf("IIR写入数据 key：%s val：%s%n", key, value);
        dataMap.put(key, value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.printf("IIR写入数据 key：%s val：%s timeout：%s timeUnit：%s%n", key, value, timeout, timeUnit);
        dataMap.put(key, value);
    }

    public void del(String key) {
        System.out.printf("IIR删除数据 key：%s%n", key);
        dataMap.remove(key);
    }

}