package cn.niudehua.designpartten.memento;

/**
 * 类名称：RoleStateMemento
 * ***********************
 * <p>
 * 类描述：角色状态存储箱类
 *
 * @author deng on 2020/12/25 13:54
 */
public class RoleStateMemento {
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

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
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