package cn.niudehua.designpartten.observer;

/**
 * 类名称：Employee
 * ***********************
 * <p>
 * 类描述：具体观察者，实现抽象观察者角色所需要的更新接口，以便使本身的状态与制图的状态相协调。
 *
 * @author deng on 2020/12/21 22:31
 */
public class Employee implements Observer {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s,%s,关闭股票行情好好工作%n", message, name);
    }


}