package cn.niudehua.designpartten.decorator;

/**
 * 类名称：Cotton
 * ***********************
 * <p>
 * 类描述：具体的装饰类
 *
 * @author deng on 2020/12/1421:58
 */
public class Cotton extends FineryDecorator {

    public Cotton(Person person) {
        this.component = person;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("棉衣");
    }
}