package cn.niudehua.designpartten.decorator;

/**
 * 类名称：TShirt
 * ***********************
 * <p>
 * 类描述：具体的装饰类
 *
 * @author deng on 2020/12/1421:30
 */
public class Shirt extends FineryDecorator {
    public Shirt(Person person) {
        this.component = person;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("T恤👕");
    }
}