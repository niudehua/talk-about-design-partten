package cn.niudehua.designpartten.prototype.shallowcopy.app;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/1621:36
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume dn = new Resume("大鸟");
        dn.setPersonalInfo("man", "22");
        dn.setWorkExperience("2016-2018", "XX公司");

        Resume dnClone = dn.clone();
        dnClone.setWorkExperience("2016-2020", "YY企业");

        Resume dnClone2 = dn.clone();
        dnClone2.setPersonalInfo("man", "24");

        System.out.println("第一个简历：");
        dn.display();
        System.out.println("第二个简历：");
        dnClone.display();
        System.out.println("第三个简历：");
        dnClone2.display();
    }
}