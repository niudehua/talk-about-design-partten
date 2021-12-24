package cn.niudehua.designpartten.decorator;

/**
 * 类名称：BigTrouser
 * ***********************
 * <p>
 * 类描述：具体的装饰类
 *
 * @author deng on 2020/12/1421:33
 */
public class Trouser extends FineryDecorator {
    public Trouser(Person person) {
        this.component = person;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("裤子👖");
    }

}