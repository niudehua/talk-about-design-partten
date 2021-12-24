package cn.niudehua.designpartten.strategy;

import java.math.BigDecimal;

/**
 * 类名称：RateStrategy
 * ***********************
 * <p>
 * 类描述：折扣率策略
 *
 * @author deng on 2020/12/1321:02
 */
public class RateStrategy implements IDiscountStrategy<Double> {
    /**
     * 按折扣率计算消费
     *
     * @param couponInfo 优惠信息：折扣率
     * @param money      消费金额
     * @return 计算折扣率后的消费金额
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal money) {
        return money.multiply(BigDecimal.valueOf(couponInfo));
    }
}