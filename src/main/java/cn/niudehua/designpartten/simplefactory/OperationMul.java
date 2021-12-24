package cn.niudehua.designpartten.simplefactory;

/**
 * 类名称：OperationMul
 * ***********************
 * <p>
 * 类描述：乘法
 *
 * @author deng on 2020/12/1300:29
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNum1() * getNum2();
    }
}