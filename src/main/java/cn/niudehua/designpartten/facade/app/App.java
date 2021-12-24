package cn.niudehua.designpartten.facade.app;

import cn.niudehua.designpartten.facade.Fund;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/2000:11
 */
public class App {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buy();
        fund.sell();
    }
}