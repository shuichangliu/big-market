package com.heidong.domain.strategy.repository;

import com.heidong.domain.strategy.model.entity.StrategyAwardEntity;
import com.heidong.domain.strategy.model.entity.StrategyEntity;
import com.heidong.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/21 14:33
 * description:策略仓储接口$
 */
public interface IStrategyRepository {
    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    int getRateRange(Long strategyId);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

    int getRateRange(String key);

    String queryStrategyRuleValue(Long strategyId, Integer awardId, String ruleModel);
}
