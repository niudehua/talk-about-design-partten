package cn.niudehua.designpartten.build;

import java.awt.*;

/**
 * 类名称：PersonThinBuilder
 * ***********************
 * <p>
 * 类描述：瘦子类
 *
 * @author deng on 2020/12/20 00:21
 */
public class PersonThinBuilder extends PersonBuilder {

    @Override
    public void buildHead(Graphics g) {
        // 画圆
        g.drawOval(50, 40, 30, 30);
    }

    @Override
    public void buildBody(Graphics g) {
        // 画矩形
        g.drawRect(60, 70, 10, 30);
    }

    @Override
    public void buildArmLeft(Graphics g) {
        // 画直线
        g.drawLine(60, 70, 40, 100);
    }

    @Override
    public void buildArmRight(Graphics g) {
        g.drawLine(70, 70, 90, 100);

    }

    @Override
    public void buildLegLeft(Graphics g) {
        g.drawLine(60, 100, 45, 150);

    }

    @Override
    public void buildLegRight(Graphics g) {
        g.drawLine(70, 100, 85, 150);

    }
}