package cn.niudehua.designpartten.factorymethod;

/**
 * 类名称：VolunteerFactory
 * ***********************
 * <p>
 * 类描述：社区志愿者工厂
 *
 * @author deng on 2020/12/1521:53
 */
public class VolunteerFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}