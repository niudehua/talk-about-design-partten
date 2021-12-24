package cn.niudehua.designpartten.strategy;

import java.math.BigDecimal;

/**
 * 类名称：NormalDiscount
 * ***********************
 * <p>
 * 类描述：正常收费策略
 *
 * @author deng on 2020/12/1320:45
 */
public class NormalStrategy implements IDiscountStrategy<BigDecimal> {

    /**
     * 正常收费策略
     *
     * @param couponInfo 优惠信息：没有优惠，正常收费
     * @param money      消费金额
     * @return 正常消费金额
     */
    @Override
    public BigDecimal discountAmount(BigDecimal couponInfo, BigDecimal money) {
        return money;
    }
}