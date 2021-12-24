package cn.niudehua.designpartten.strategy;

import java.math.BigDecimal;

/**
 * 类名称：AmountContext
 * ***********************
 * <p>
 * 类描述：收费上下文用来使用策略的
 *
 * @author deng on 2020/12/1321:07
 */
public class AmountContext<T> {
    private final IDiscountStrategy<T> discountStrategy;

    public AmountContext(IDiscountStrategy<T> discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal money) {
        return discountStrategy.discountAmount(couponInfo, money);
    }
}