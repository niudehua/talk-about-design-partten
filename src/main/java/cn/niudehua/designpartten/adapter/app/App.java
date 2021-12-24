package cn.niudehua.designpartten.adapter.app;

import cn.niudehua.designpartten.adapter.ForeignCenter;
import cn.niudehua.designpartten.adapter.Forward;
import cn.niudehua.designpartten.adapter.Guard;
import cn.niudehua.designpartten.adapter.Player;
import cn.niudehua.designpartten.adapter.Translator;

/**
 * 类名称：App
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/24 09:35
 */
public class App {
    public static void main(String[] args) {
        Player player1 = new Forward("巴蒂尔");
        Player player2= new Guard("麦克格雷迪");
        Player player3 = new Translator("大姚");

        player1.attack();
        player2.attack();
        player3.attack();

        player1.defense();
        player2.defense();
        player3.defense();

    }
}