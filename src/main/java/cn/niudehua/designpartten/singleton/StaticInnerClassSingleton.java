package cn.niudehua.designpartten.singleton;

/**
 * 类名称：StaticInnerClassSingleton
 * ***********************
 * <p>
 * 类描述：静态内部类单例
 *
 * @author deng on 2020/12/31 13:32
 */
public class StaticInnerClassSingleton {

   private static class Singleton {
       private static final StaticInnerClassSingleton STATIC_INNER_CLASS_SINGLETON = new StaticInnerClassSingleton();
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton staticInnerClassSingleton = Singleton.STATIC_INNER_CLASS_SINGLETON;

    }
}