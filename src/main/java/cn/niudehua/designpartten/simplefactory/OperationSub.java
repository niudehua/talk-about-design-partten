package cn.niudehua.designpartten.simplefactory;

/**
 * 类名称：OperationSub
 * ***********************
 * <p>
 * 类描述：减法
 *
 * @author deng on 2020/12/1300:29
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNum1() - getNum2();
    }
}