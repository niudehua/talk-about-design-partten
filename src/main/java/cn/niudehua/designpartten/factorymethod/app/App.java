package cn.niudehua.designpartten.factorymethod.app;

import cn.niudehua.designpartten.factorymethod.IFactory;
import cn.niudehua.designpartten.factorymethod.LeiFeng;
import cn.niudehua.designpartten.factorymethod.SimpleFactory;
import cn.niudehua.designpartten.factorymethod.Undergraduate;
import cn.niudehua.designpartten.factorymethod.UndergraduateFactory;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：
 *
 * @author deng on 2020/12/1521:44
 */
public class App {
    public static void main(String[] args) {
        LeiFeng student1 = new Undergraduate();
        student1.sweep();
        LeiFeng student2 = new Undergraduate();
        student2.wash();
        LeiFeng student3 = new Undergraduate();
        student3.buyRice();

        // 简单工厂模式
        System.out.println("简单工厂模式：");
        LeiFeng studentA = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentA.sweep();
        LeiFeng studentB = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentB.wash();
        LeiFeng studentC = SimpleFactory.createLeiFeng("学雷锋的大学生");
        studentC.buyRice();

        // 工厂方法模式
        System.out.println("工厂方法模式：");
        IFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng studentX = undergraduateFactory.createLeiFeng();
        studentX.sweep();
        LeiFeng studentY = undergraduateFactory.createLeiFeng();
        studentY.wash();
        LeiFeng studentZ = undergraduateFactory.createLeiFeng();
        studentZ.buyRice();
    }
}