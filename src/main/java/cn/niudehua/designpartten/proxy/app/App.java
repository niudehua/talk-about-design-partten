package cn.niudehua.designpartten.proxy.app;

import cn.niudehua.designpartten.proxy.Proxy;
import cn.niudehua.designpartten.proxy.SchoolGirl;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/1521:16
 */
public class App {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("娇娇");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}