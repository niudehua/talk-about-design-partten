package cn.niudehua.designpartten.simplefactory;

import cn.niudehua.designpartten.simplefactory.OperationDiv;
import cn.niudehua.designpartten.simplefactory.OperationMul;
import cn.niudehua.designpartten.simplefactory.Operation;
import cn.niudehua.designpartten.simplefactory.OperationAdd;
import cn.niudehua.designpartten.simplefactory.OperationSub;

/**
 * 类名称：OperationFactory
 * ***********************
 * <p>
 * 类描述：简单工厂
 *
 * @author deng on 2020/12/1300:26
 */
public class OperationFactory {
    private OperationFactory() {
    }

    public static Operation createOperation(String operator) {
        Operation operation;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("请输入正确的运算符！！！");
        }
        return operation;
    }
}