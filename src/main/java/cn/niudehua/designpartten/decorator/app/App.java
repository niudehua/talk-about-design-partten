package cn.niudehua.designpartten.decorator.app;

import cn.niudehua.designpartten.decorator.Cotton;
import cn.niudehua.designpartten.decorator.Jacket;
import cn.niudehua.designpartten.decorator.Person;
import cn.niudehua.designpartten.decorator.Shirt;
import cn.niudehua.designpartten.decorator.Trouser;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端实现
 *
 * @author deng on 2020/12/1421:35
 */
public class App {
    public static void main(String[] args) {

        Person xc = new Person("小菜");
        System.out.println("第一种装扮：");
        Jacket jacket = new Jacket(xc);
        Shirt shirt = new Shirt(jacket);
        shirt.show();

        Person dn = new Person("大鸟");
        System.out.println("第二种装扮：");
        Trouser trouser = new Trouser(dn);
        Jacket jacket1 = new Jacket(trouser);
        Cotton cotton = new Cotton(jacket1);
        cotton.show();
    }
}