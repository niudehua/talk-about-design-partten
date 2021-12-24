package cn.niudehua.designpartten.strategy;

import java.math.BigDecimal;

/**
 * 类名称：DiscountStrategy
 * ***********************
 * <p>
 * 类描述：优惠策略抽象类
 *
 * @author deng on 2020/12/1320:36
 */
public interface IDiscountStrategy<T> {
    /**
     * 计算折扣金额
     *
     * @param couponInfo 优惠信息
     * @param money      消费金额
     * @return 优惠后的消费金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal money);
}