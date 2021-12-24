package cn.niudehua.designpartten.prototype.shallowcopy;

/**
 * 类名称：Resume
 * ***********************
 * <p>
 * 类描述：简历类
 *
 * @author deng on 2020/12/1621:28
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }


    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.printf("姓名:%s,性别:%s,年龄:%s", name, sex, age);
        System.out.printf("工作经历：%s,%s\n", timeArea, company);
    }

    /**
     * clone方法
     *
     * @return Resume
     * @throws CloneNotSupportedException clone不支持
     */
    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }
}