package cn.niudehua.designpartten.simplefactory;

/**
 * 类名称：OperationAdd
 * ***********************
 * <p>
 * 类描述：加法
 *
 * @author deng on 2020/12/1300:29
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNum1() + getNum2();
    }
}