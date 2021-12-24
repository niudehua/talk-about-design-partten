package cn.niudehua.designpartten.state;

/**
 * 类名称：ForcedOffWorkState
 * ***********************
 * <p>
 * 类描述：强制下班状态
 *
 * @author deng on 2020/12/22 22:45
 */
public class ForcedOffWorkState extends State {
    @Override
    public void programming(Work work) {
        System.out.printf("当前时间：%s,超过20点了强制下班回家咯！%n", work.getHour());
    }
}