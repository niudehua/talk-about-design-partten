package cn.niudehua.designpartten.state;

/**
 * 类名称：Work
 * ***********************
 * <p>
 * 类描述：工作
 *
 * @author deng on 2020/12/22 22:20
 */
public class Work {
    private State current;

    public Work() {
        // 工作初始化为上午工作状态，即上午9点开始上班
        this.current = new ForenoonState();
    }

    /**
     * "钟点"属性，状态转换的依据
     */
    private double hour;
    /**
     * "任务完成"属性，是否能下班的依据
     */
    private boolean taskFinished;

    public void setCurrent(State current) {
        this.current = current;
    }

    public void programming() {
        current.programming(this);
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }
}