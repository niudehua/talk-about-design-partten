package cn.niudehua.designpartten.observer;

/**
 * 类名称：Subject
 * ***********************
 * <p>
 * 类描述：它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象
 *
 * @author deng on 2020/12/21 15:25
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();


}