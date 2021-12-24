package cn.niudehua.designpartten.singleton;

/**
 * 类名称：HungerSingleton
 * ***********************
 * <p>
 * 类描述：饿汉式
 *
 * @author deng on 2020/12/30 22:58
 */
public class HungerSingleton {
    private static final HungerSingleton INSTANCE = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance() {
        return INSTANCE;
    }

}