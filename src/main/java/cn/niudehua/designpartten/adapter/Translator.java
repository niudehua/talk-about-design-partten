package cn.niudehua.designpartten.adapter;

/**
 * 类名称：Translator
 * ***********************
 * <p>
 * 类描述：翻译者类
 *
 * @author deng on 2020/12/24 09:32
 */
public class Translator extends Player {
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        foreignCenter.防守();
    }
}