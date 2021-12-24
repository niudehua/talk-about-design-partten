package cn.niudehua.designpartten.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：ConcreteCollection
 * ***********************
 * <p>
 * 类描述：具体聚集类 集成Collection
 *
 * @author deng on 2020/12/27 09:45
 */
public class ConcreteCollection extends Collection {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    public int count() {
        return items.size();
    }

    public Object add() {
        return null;
    }
}