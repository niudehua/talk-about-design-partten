package cn.niudehua.designpartten.proxy;

/**
 * 类名称：Pursuer
 * ***********************
 * <p>
 * 类描述：追求者类 真实主题
 *
 * @author deng on 2020/12/1521:08
 */
public class Pursuer implements IGiveGift {
    private SchoolGirl mm;

    public Pursuer(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.printf("送%s一个洋娃娃~%n", mm.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.printf("送%s一束鲜花💐~%n", mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.printf("送%s一盒巧克力🍫~%n", mm.getName());
    }
}