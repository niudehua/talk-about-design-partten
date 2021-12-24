package cn.niudehua.designpartten.template;

/**
 * 类名称：TestPaperB
 * ***********************
 * <p>
 * 类描述：学生B的试卷 正确答案
 *
 * @author deng on 2020/12/1623:25
 */
public class TestPaperB extends TestPaper {
    @Override
    protected String answer1() {
        return "D";
    }

    @Override
    protected String answer2() {
        return "A";
    }

    @Override
    protected String answer3() {
        return "B";
    }
}