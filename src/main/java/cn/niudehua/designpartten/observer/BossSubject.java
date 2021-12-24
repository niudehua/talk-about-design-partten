package cn.niudehua.designpartten.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：BossSubject
 * ***********************
 * <p>
 * 类描述：具体主题，将有关状态存入具体观察者对象，在具体主题的内部状态改变时，给所有登记过的观察者发出通知
 *
 * @author deng on 2020/12/21 15:32
 */
public class BossSubject implements Subject {
    private final List<Observer> list;
    private String message;

    public BossSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if (!list.isEmpty()) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        //消息更新，通知所有观察者
        notifyObserver();
    }
}