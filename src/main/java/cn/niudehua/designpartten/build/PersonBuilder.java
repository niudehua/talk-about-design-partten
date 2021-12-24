package cn.niudehua.designpartten.build;

import java.awt.*;

/**
 * 类名称：PersonBuilder
 * ***********************
 * <p>
 * 类描述：抽象的建造人的类
 *
 * @author deng on 2020/12/20 00:16
 */
public abstract class PersonBuilder {
    public PersonBuilder() {

    }


    public abstract void buildHead(Graphics g);

    public abstract void buildBody(Graphics g);

    public abstract void buildArmLeft(Graphics g);

    public abstract void buildArmRight(Graphics g);

    public abstract void buildLegLeft(Graphics g);

    public abstract void buildLegRight(Graphics g);

    public static void main(String[] args) {
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();

    }

}