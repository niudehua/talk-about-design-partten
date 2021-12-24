package cn.niudehua.designpartten.memento.app;

import cn.niudehua.designpartten.memento.GameRole;
import cn.niudehua.designpartten.memento.RoleStateCaretaker;

/**
 * 类名称：APP
 * ***********************
 * <p>
 * 类描述：客户端
 *
 * @author deng on 2020/12/25 14:03
 */
public class APP {
    public static void main(String[] args) {
        // 游戏角色初始化
        System.out.println("游戏角色初始化");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        // 游戏角色状态备份
        System.out.println("游戏角色状态备份");
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
        // 发起战斗
        System.out.println("发起战斗");
        gameRole.fight();
        gameRole.stateDisplay();
        // 回档
        System.out.println("回档");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}