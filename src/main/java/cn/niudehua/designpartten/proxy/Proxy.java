package cn.niudehua.designpartten.proxy;

/**
 * 类名称：Proxy
 * ***********************
 * <p>
 * 类描述：代理类
 *
 * @author deng on 2020/12/1521:14
 */
public class Proxy implements IGiveGift {
    private Pursuer gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuer(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}