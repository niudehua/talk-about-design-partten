package cn.niudehua.designpartten.singleton;

/**
 * 枚举单例
 *
 * @author deng
 * @datetime 2020/12/31 13:08
 */
public enum SingletonEnum {
    /**
     * 枚举单例
     */
    ENUM_SINGLETON;

    public void doSomething() {
        System.out.println("doSomething...");
    }

    public static void main(String[] args) {
        SingletonEnum.ENUM_SINGLETON.doSomething();
    }
}


