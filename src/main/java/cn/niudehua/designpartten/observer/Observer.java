package cn.niudehua.designpartten.observer;

/**
 * 类名称：Observer
 * ***********************
 * <p>
 * 类描述：抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己
 *
 * @author deng on 2020/12/20 23:08
 */
public interface Observer {
    void update(String message);

}