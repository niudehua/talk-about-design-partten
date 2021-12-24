package cn.niudehua.designpartten.facade;

/**
 * 类名称：Fund
 * ***********************
 * <p>
 * 类描述：基金类
 *
 * @author deng on 2020/12/2000:02
 */
public class Fund {
    private Stock1 gu1;
    private Stock2 gu2;
    private Stock3 gu3;
    private NationalDebt1 nd1;
    private Realty1 rt1;

    public Fund() {
        this.gu1 = new Stock1();
        this.gu2 = new Stock2();
        this.gu3 = new Stock3();
        this.nd1 = new NationalDebt1();
        this.rt1 = new Realty1();
    }

    public void sell() {
        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();
    }

    public void buy() {
        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();
    }
}