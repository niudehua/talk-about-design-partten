package cn.niudehua.designpartten.state;

/**
 * 类名称：SleepingState
 * ***********************
 * <p>
 * 类描述：
 *
 * @author deng on 2020/12/22 22:37
 */
public class SleepingState extends State {
    @Override
    public void programming(Work work) {
        System.out.printf("当前时间：%s点了，不行了，睡着了%n", work.getHour());
    }
}