package cn.niudehua.designpartten.adapter;

/**
 * 类名称：ForeignCenter
 * ***********************
 * <p>
 * 类描述：外籍中锋
 *
 * @author deng on 2020/12/24 09:30
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.printf("外籍中锋%s发起进攻%n", name);
    }

    public void 防守() {
        System.out.printf("外籍中锋%s展开防守%n", name);
    }
}