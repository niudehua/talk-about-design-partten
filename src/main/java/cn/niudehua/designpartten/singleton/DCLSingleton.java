package cn.niudehua.designpartten.singleton;

import java.util.Objects;

/**
 * 类名称：DCLSingleton
 * ***********************
 * <p>
 * 类描述：双重检查锁单例
 *
 * @author deng on 2020/12/31 13:09
 */
public class DCLSingleton {
    private static volatile DCLSingleton dclSingleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (Objects.isNull(dclSingleton)) {
            synchronized (DCLSingleton.class) {
                if (Objects.isNull(dclSingleton)) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}