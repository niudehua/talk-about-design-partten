package cn.niudehua.designpartten.decorator;

/**
 * 类名称：Jacket
 * ***********************
 * <p>
 * 类描述：具体的装饰类
 *
 * @author deng on 2020/12/1421:57
 */
public class Jacket extends FineryDecorator {
    public Jacket(Person person) {
        this.component = person;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("夹克");
    }
}