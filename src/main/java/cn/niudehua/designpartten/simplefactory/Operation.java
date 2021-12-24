package cn.niudehua.designpartten.simplefactory;

/**
 * 类名称：Operation
 * ***********************
 * <p>
 * 类描述：运算类
 *
 * @author deng on 2020/12/1300:26
 */
public abstract class Operation {

    public double num1;
    public double num2;


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    /**
     * 对 num1和num2做运算
     *
     * @return 返回运算结果
     */
    public abstract double getResult();
}