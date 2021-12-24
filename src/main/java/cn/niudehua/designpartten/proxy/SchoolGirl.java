package cn.niudehua.designpartten.proxy;

/**
 * 类名称：SchoolGirl
 * ***********************
 * <p>
 * 类描述：
 *
 * @author deng on 2020/12/1521:09
 */
public class SchoolGirl {

    public SchoolGirl() {
    }

    public SchoolGirl(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}