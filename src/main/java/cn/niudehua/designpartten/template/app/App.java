package cn.niudehua.designpartten.template.app;

import cn.niudehua.designpartten.template.TestPaperA;
import cn.niudehua.designpartten.template.TestPaperB;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/1623:27
 */
public class App {
    public static void main(String[] args) {
        System.out.println("学生A的试卷：");
        TestPaperA testPaperA = new TestPaperA();
        testPaperA.question1();
        testPaperA.question2();
        testPaperA.question3();
        System.out.println("----------------------");
        System.out.println("学生B的试卷：");
        TestPaperB testPaperB = new TestPaperB();
        testPaperB.question1();
        testPaperB.question2();
        testPaperB.question3();
    }
}