package cn.niudehua.designpartten.state.app;

import cn.niudehua.designpartten.state.Work;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/22 22:38
 */
public class App {
    public static void main(String[] args) {
        // 紧急项目
        Work emergencyProject = new Work();
        emergencyProject.setHour(9);
        emergencyProject.programming();
        emergencyProject.setHour(10);
        emergencyProject.programming();
        emergencyProject.setHour(12);
        emergencyProject.programming();
        emergencyProject.setHour(13);
        emergencyProject.programming();
        emergencyProject.setHour(14);
        emergencyProject.programming();
        emergencyProject.setHour(17);
        emergencyProject.programming();
        emergencyProject.setHour(19);
        emergencyProject.programming();
        emergencyProject.setHour(22);
        emergencyProject.programming();
        emergencyProject.setHour(23);
        emergencyProject.programming();
    }
}