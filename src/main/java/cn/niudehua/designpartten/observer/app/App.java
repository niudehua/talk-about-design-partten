package cn.niudehua.designpartten.observer.app;

import cn.niudehua.designpartten.observer.BossSubject;
import cn.niudehua.designpartten.observer.Employee;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/21 22:34
 */
public class App {
    public static void main(String[] args) {
        BossSubject bossSubject = new BossSubject();
        Employee e = new Employee("魏关姹");
        bossSubject.attach(e);
        Employee e1 = new Employee("易管查");
        bossSubject.attach(e1);
        bossSubject.setInformation("老板胡汉三回来了");
        bossSubject.detach(e1);
        bossSubject.setInformation("我胡汉三又回来了");
    }
}