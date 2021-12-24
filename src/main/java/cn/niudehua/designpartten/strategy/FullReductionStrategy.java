package cn.niudehua.designpartten.strategy;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 类名称：FullReductionStrategy
 * ***********************
 * <p>
 * 类描述：满减策略
 *
 * @author deng on 2020/12/1320:45
 */
public class FullReductionStrategy implements IDiscountStrategy<Map<String, String>> {

    /**
     * 满减策略 满full减reduction
     *
     * @param couponInfo 优惠信息 ："full"->满，"reduction"->减
     * @param money      消费金额
     * @return 计算优惠后金额
     */
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal money) {
        BigDecimal full = new BigDecimal(couponInfo.get("full"));
        BigDecimal reduction = new BigDecimal(couponInfo.get("reduction"));
        // 如果商品总额没有达到满减条件，返回实际商品总额
        if (full.compareTo(reduction) < 0) {
            return money;
        }
        return money.subtract(reduction);
    }
}