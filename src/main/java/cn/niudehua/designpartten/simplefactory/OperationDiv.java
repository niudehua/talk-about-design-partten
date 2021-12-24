package cn.niudehua.designpartten.simplefactory;

/**
 * 类名称：OperationDiv
 * ***********************
 * <p>
 * 类描述：除法
 *
 * @author deng on 2020/12/1300:29
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        return getNum1() / getNum2();
    }
}