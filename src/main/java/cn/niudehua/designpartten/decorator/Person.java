package cn.niudehua.designpartten.decorator;

/**
 * 类名称：Person
 * ***********************
 * <p>
 * 类描述：ConcreteComponent 具体的主体
 *
 * @author deng on 2020/12/1421:21
 */
public class Person {
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("%s的穿着清单：%n", name);
    }
}