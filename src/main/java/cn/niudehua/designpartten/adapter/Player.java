package cn.niudehua.designpartten.adapter;

/**
 * 类名称：Player
 * ***********************
 * <p>
 * 类描述：球员类
 *
 * @author deng on 2020/12/24 09:22
 */
public abstract class Player {
    protected String name;

    protected Player(String name) {
        this.name = name;
    }

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}