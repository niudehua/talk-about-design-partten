package cn.niudehua.designpartten.iterator;

/**
 * 类名称：Iterator
 * ***********************
 * <p>
 * 类描述：迭代器抽象类
 *
 * @author deng on 2020/12/27 09:41
 */
public abstract class Iterator {
    public abstract Object first();

    public abstract Object next();

    public abstract Object isDone();

    public abstract Object currentItem();

}