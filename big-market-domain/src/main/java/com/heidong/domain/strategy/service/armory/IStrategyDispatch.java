package com.heidong.domain.strategy.service.armory;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/30 21:41
 * description:策略抽奖调度$
 */
public interface IStrategyDispatch {
    /**
     * 获取抽奖策略装配的随机结果
     * @param strategyId
     * @return
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
