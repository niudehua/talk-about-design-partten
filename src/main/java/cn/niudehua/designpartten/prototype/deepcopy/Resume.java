package cn.niudehua.designpartten.prototype.deepcopy;

/**
 * 类名称：Resume
 * ***********************
 * <p>
 * 类描述：简历
 *
 * @author deng on 2020/12/1622:09
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        Resume clone = (Resume) super.clone();
        WorkExperience workExperience = clone.getWorkExperience();
        clone.setWorkExperience(workExperience.clone());
        return clone;
    }


    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}