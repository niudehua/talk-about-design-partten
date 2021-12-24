package cn.niudehua.designpartten.adapter;

/**
 * 类名称：CenterForward
 * ***********************
 * <p>
 * 类描述：中锋
 *
 * @author deng on 2020/12/24 09:26
 */
public class CenterForward extends Player {
    public CenterForward(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("中锋%s发起进攻%n", name);
    }

    @Override
    public void defense() {
        System.out.printf("中锋%s展开防守%n", name);
    }
}