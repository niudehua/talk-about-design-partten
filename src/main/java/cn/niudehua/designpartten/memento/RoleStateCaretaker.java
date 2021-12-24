package cn.niudehua.designpartten.memento;

/**
 * 类名称：RoleStateCaretaker
 * ***********************
 * <p>
 * 类描述：角色状态看守人
 *
 * @author deng on 2020/12/25 14:02
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}