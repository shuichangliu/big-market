package com.heidong.domain.strategy.service.armory;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/21 14:25
 * description:装配工厂$
 */
public interface IStrategyArmory {
    /**
     * 装配抽奖策略配置
     * @param strategyId
     */
    boolean assembleLotteryStrategy(Long strategyId);


}
