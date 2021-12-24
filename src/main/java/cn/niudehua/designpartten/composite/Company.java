package cn.niudehua.designpartten.composite;

/**
 * 类名称：Company
 * ***********************
 * <p>
 * 类描述：公司抽象类
 *
 * @author deng on 2020/12/25 14:11
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int i);

    public abstract void lineOfDuty();

}