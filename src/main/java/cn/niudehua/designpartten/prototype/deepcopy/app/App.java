package cn.niudehua.designpartten.prototype.deepcopy.app;


import cn.niudehua.designpartten.prototype.deepcopy.Resume;
import cn.niudehua.designpartten.prototype.deepcopy.WorkExperience;

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
        WorkExperience workExperience = new WorkExperience();
        workExperience.setWorkDate("2012-2016");
        workExperience.setCompany("XX公司");
        dn.setPersonalInfo("man", "22");
        dn.setWorkExperience(workExperience);

        Resume dnClone = dn.clone();
        WorkExperience experience = new WorkExperience();
        WorkExperience workExperience1 = dnClone.getWorkExperience();
        workExperience1.setCompany("YY企业");
        dnClone.setWorkExperience(workExperience1);

        Resume dnClone2 = dn.clone();
        dnClone2.setPersonalInfo("man", "28");

        System.out.println("第一个简历：");
        System.out.println(dn);
        System.out.println("第二个简历：");
        System.out.println(dnClone);
        System.out.println("第三个简历：");
        System.out.println(dnClone2);
        ;
    }
}