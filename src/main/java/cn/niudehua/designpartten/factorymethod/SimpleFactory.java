package cn.niudehua.designpartten.factorymethod;

/**
 * 类名称：SimpleFactory
 * ***********************
 * <p>
 * 类描述：简单雷锋工厂
 *
 * @author deng on 2020/12/1521:46
 */
public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type) {
        LeiFeng result = null;
        switch (type) {
            case "学雷锋的大学生":
                result = new Undergraduate();
                break;
            case "社区志愿者":
                result = new Volunteer();
                break;
            default:

        }
        return result;
    }
}