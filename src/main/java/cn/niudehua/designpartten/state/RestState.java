package cn.niudehua.designpartten.state;

/**
 * 类名称：RestState
 * ***********************
 * <p>
 * 类描述：下班休息状态
 *
 * @author deng on 2020/12/22 22:35
 */
public class RestState extends State {
    @Override
    public void programming(Work work) {
        System.out.printf("%s点了，下班回家咯~%n", work.getHour());
    }
}