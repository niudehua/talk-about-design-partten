package cn.niudehua.designpartten.template;

/**
 * 类名称：TestPaper
 * ***********************
 * <p>
 * 类描述：考题试卷
 *
 * @author deng on 2020/12/1623:19
 */
public abstract class TestPaper {
    public void question1() {
        System.out.println("JAVA所定义的版本中不包括:");
        System.out.println("A.JAVA2 EE");
        System.out.println("B.JAVA2 Card");
        System.out.println("C.JAVA2 ME");
        System.out.println("D.JAVA2 HE");
        System.out.println("E.JAVA2 SE");
        System.out.println("答案:" + answer1());
    }

    public void question2() {
        System.out.println("下列说法正确的是:");
        System.out.println("A.JAVA程序的main方法必须写在类里面");
        System.out.println("B.JAVA程序中可以有多个main方法");
        System.out.println("C.JAVA程序中类名必须与文件名一样");
        System.out.println("D.JAVA程序的main方法中如果只有一条语句，可以不用{}(大括号)括起来");
        System.out.println("答案："+answer2());
    }

    public void question3() {
        System.out.println("变量命名规范说法正确的是:");
        System.out.println("A.变量由字母、下划线、数字、$符号随意组成；");
        System.out.println("B.变量不能以数字作为开头；");
        System.out.println("C.A和a在java中是同一个变量；");
        System.out.println("D.不同类型的变量，可以起相同的名字；");
        System.out.println("答案:" + answer3());
    }

    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();

}