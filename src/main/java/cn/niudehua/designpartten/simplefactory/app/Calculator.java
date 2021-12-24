package cn.niudehua.designpartten.simplefactory.app;

import cn.niudehua.designpartten.simplefactory.OperationFactory;
import cn.niudehua.designpartten.simplefactory.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 类名称：Calculator
 * ***********************
 * <p>
 * 类描述：计算器
 *
 * @author deng on 2020/12/1300:45
 */
public class Calculator {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入num1");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br1.readLine();
        System.out.println("请输入运算符");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String operator = br2.readLine();
        System.out.println("请输入num2");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String num2 = br3.readLine();

        Operation operation = OperationFactory.createOperation(operator);
        operation.num1 = Double.parseDouble(num1);
        operation.num2 = Double.parseDouble(num2);
        double result = operation.getResult();
        System.out.printf("运算结果为%s", result);
    }
}