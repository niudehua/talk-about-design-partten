package cn.niudehua.designpartten.template;

/**
 * 类名称：TestPaperA
 * ***********************
 * <p>
 * 类描述：学生A的试卷
 *
 * @author deng on 2020/12/1623:25
 */
public class TestPaperA extends TestPaper{
    @Override
    protected String answer1() {
        return "B";
    }

    @Override
    protected String answer2() {
        return "C";
    }

    @Override
    protected String answer3() {
        return "A";
    }
}