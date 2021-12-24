package cn.niudehua.designpartten.prototype.deepcopy;

/**
 * 类名称：WorkExperience
 * ***********************
 * <p>
 * 类描述：
 *
 * @author deng on 2020/12/1622:10
 */
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}