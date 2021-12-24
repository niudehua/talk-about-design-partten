package cn.niudehua.designpartten.build;

import javax.swing.*;
import java.awt.*;

/**
 * 类名称：PersonDirector
 * ***********************
 * <p>
 * 类描述：指挥者
 *
 * @author deng on 2020/12/20 01:04
 */
public class PersonDirector extends JFrame {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        setSize(300, 300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit()
                .getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        setVisible(true);
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        personBuilder.buildHead(this.getGraphics());
        personBuilder.buildBody(this.getGraphics());
        personBuilder.buildArmLeft(this.getGraphics());
        personBuilder.buildArmRight(this.getGraphics());
        personBuilder.buildLegLeft(this.getGraphics());
        personBuilder.buildLegRight(this.getGraphics());
    }

}