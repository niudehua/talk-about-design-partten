package cn.niudehua.designpartten.decorator;

/**
 * 类名称：Finery
 * ***********************
 * <p>
 * 类描述：Decorator 抽象装饰类
 *
 * @author deng on 2020/12/1421:24
 */
public abstract class FineryDecorator extends Person {

    protected Person component;

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}