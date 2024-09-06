package com.heidong.domain.strategy.service.rule;

import com.heidong.domain.strategy.model.entity.RuleActionEntity;
import com.heidong.domain.strategy.model.entity.RuleMatterEntity;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/5 20:09
 * description:抽奖规则过滤接口$
 */
public interface ILogicFilter<R extends RuleActionEntity.RaffleEntity> {
    /** 过滤方法*/
    RuleActionEntity filter(RuleMatterEntity ruleMatterEntity);
}
