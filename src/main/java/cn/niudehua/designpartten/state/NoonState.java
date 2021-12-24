package cn.niudehua.designpartten.state;

/**
 * 类名称：NoonState
 * ***********************
 * <p>
 * 类描述：中午状态
 *
 * @author deng on 2020/12/22 22:29
 */
public class NoonState extends State {
    @Override
    public void programming(Work work) {
        if (work.getHour() < 13) {
            System.out.printf("当前时间：%s,肚子饿了，午饭，犯困，午休！！！%n", work.getHour());
        } else {
            // 超过13点，转入下午工作状态
            work.setCurrent(new AfterNoonState());
            work.programming();
        }

    }
}