package cn.niudehua.designpartten.memento;

/**
 * 类名称：GameRole
 * ***********************
 * <p>
 * 类描述：游戏角色
 *
 * @author deng on 2020/12/25 13:50
 */
public class GameRole {
    /**
     * 生命值
     */
    private int vit;
    /**
     * 攻击力
     */
    private int atk;
    /**
     * 防御力
     */
    private int def;

    /**
     * 初始化状态
     */
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    /**
     * 战斗
     */
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    /**
     * 显示状态
     */
    public void stateDisplay() {
        System.out.println("角色当前状态为：");
        System.out.printf("体力：%s%n", this.vit);
        System.out.printf("攻击力：%s%n", this.atk);
        System.out.printf("防御力：%s%n", this.def);
    }

    /**
     * 保存角色状态
     *
     * @return RoleStateMemento
     */
    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vit, this.atk, this.def);
    }

    /**
     * 恢复角色状态
     *
     * @param roleStateMemento 角色状态存储箱类
     */
    public void recoverState(RoleStateMemento roleStateMemento) {
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }


    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}