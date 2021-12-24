package cn.niudehua.designpartten.adapter;

/**
 * 类名称：Forward
 * ***********************
 * <p>
 * 类描述：前锋
 *
 * @author deng on 2020/12/24 09:24
 */
public class Forward extends Player {
    public Forward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("前锋%s发起进攻%n", name);

    }

    @Override
    public void defense() {
        System.out.printf("前锋%s展开防守%n", name);
    }
}