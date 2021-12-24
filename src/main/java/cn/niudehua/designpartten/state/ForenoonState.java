package cn.niudehua.designpartten.state;

/**
 * 类名称：ForenoonState
 * ***********************
 * <p>
 * 类描述：上午状态
 *
 * @author deng on 2020/12/22 22:27
 */
public class ForenoonState extends State {
    @Override
    public void programming(Work work) {
        if (work.getHour() < 12) {
            System.out.printf("当前时间：%s,上午工作，精神百倍！%n", work.getHour());
        } else {
            // 超过12点，转入中午工作状态
            work.setCurrent(new NoonState());
            work.programming();
        }
    }
}