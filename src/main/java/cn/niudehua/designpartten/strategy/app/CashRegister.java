package cn.niudehua.designpartten.strategy.app;

import cn.niudehua.designpartten.strategy.AmountContext;
import cn.niudehua.designpartten.strategy.FullReductionStrategy;
import cn.niudehua.designpartten.strategy.NormalStrategy;
import cn.niudehua.designpartten.strategy.RateStrategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 类名称：CashRegister
 * ***********************
 * <p>
 * 类描述：收银
 *
 * @author deng on 2020/12/1321:18
 */
public class CashRegister {
    public static void main(String[] args) {
        // 折扣率
        AmountContext<Double> rateAmount = new AmountContext<>(new RateStrategy());
        BigDecimal amount1 = rateAmount.discountAmount(0.8, BigDecimal.valueOf(500));
        System.out.println(amount1);
        // 正常结算
        AmountContext<BigDecimal> normalAmount = new AmountContext<>(new NormalStrategy());
        BigDecimal amount2 = normalAmount.discountAmount(null, BigDecimal.valueOf(1000));
        System.out.println(amount2);
        // 满减
        AmountContext<Map<String, String>> fullReductionAmount = new AmountContext<>(new FullReductionStrategy());
        HashMap<String, String> fullReductionMap = new HashMap<>();
        fullReductionMap.put("full", "1000");
        fullReductionMap.put("reduction", "800");
        BigDecimal amount3 = fullReductionAmount.discountAmount(fullReductionMap, BigDecimal.valueOf(2000));
        System.out.println(amount3);
    }
}
