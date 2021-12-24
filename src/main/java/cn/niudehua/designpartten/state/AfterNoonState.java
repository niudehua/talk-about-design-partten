package cn.niudehua.designpartten.state;

/**
 * 类名称：AfterNoonState
 * ***********************
 * <p>
 * 类描述：下午状态
 *
 * @author deng on 2020/12/22 22:31
 */
public class AfterNoonState extends State {
    @Override
    public void programming(Work work) {
        if (work.getHour() < 17) {
            System.out.printf("当前时间：%s,下午状态还不错，继续努力！%n", work.getHour());
        } else if (work.getHour() < 20) {
            // 超过17点，转入傍晚工作状态
            work.setCurrent(new EveningState());
            work.programming();
        }

    }
}