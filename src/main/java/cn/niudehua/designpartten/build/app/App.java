package cn.niudehua.designpartten.build.app;

import cn.niudehua.designpartten.build.PersonDirector;
import cn.niudehua.designpartten.build.PersonThinBuilder;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/20 01:21
 */
public class App {
    public static void main(String[] args) {
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();
        PersonDirector personDirector = new PersonDirector(personThinBuilder);
        personDirector.createPerson();
    }
}