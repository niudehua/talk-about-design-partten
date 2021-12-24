package cn.niudehua.designpartten.adapter;

/**
 * 类名称：Guard
 * ***********************
 * <p>
 * 类描述：后卫
 *
 * @author deng on 2020/12/24 09:28
 */
public class Guard extends Player {

    public Guard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.printf("后卫%s发起进攻%n", name);
    }

    @Override
    public void defense() {
        System.out.printf("后卫%s展开防守%n", name);
    }
}