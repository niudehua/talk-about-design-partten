package cn.niudehua.designpartten.state;

/**
 * 类名称：EveningState
 * ***********************
 * <p>
 * 类描述：傍晚状态
 *
 * @author deng on 2020/12/22 22:33
 */
public class EveningState extends State {
    @Override
    public void programming(Work work) {
        if (work.isTaskFinished()) {
            // 如果完成任务就进入下班状态
            work.setCurrent(new RestState());
            work.programming();
        }
        if (work.getHour() > 20) {
            // 超过20点，转入强制下班状态
            work.setCurrent(new ForcedOffWorkState());
            work.programming();
        } else if (work.getHour() < 21) {
            System.out.printf("当前时间：%s,加班哦，疲惫至极！%n", work.getHour());
        } else {
            // 超过21点，转入睡眠工作状态
            work.setCurrent(new SleepingState());
            work.programming();
        }

    }
}