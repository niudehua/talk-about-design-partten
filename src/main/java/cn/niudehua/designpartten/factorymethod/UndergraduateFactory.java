package cn.niudehua.designpartten.factorymethod;

/**
 * 类名称：UndergraduateFactory
 * ***********************
 * <p>
 * 类描述：学雷锋的大学生工厂
 *
 * @author deng on 2020/12/1521:52
 */
public class UndergraduateFactory  implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}