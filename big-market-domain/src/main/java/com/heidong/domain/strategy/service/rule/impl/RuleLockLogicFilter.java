package com.heidong.domain.strategy.service.rule.impl;


import com.heidong.domain.strategy.model.entity.RuleActionEntity;
import com.heidong.domain.strategy.model.entity.RuleMatterEntity;
import com.heidong.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import com.heidong.domain.strategy.repository.IStrategyRepository;
import com.heidong.domain.strategy.service.annotation.LogicStrategy;
import com.heidong.domain.strategy.service.rule.ILogicFilter;
import com.heidong.domain.strategy.service.rule.factory.DefaultLogicFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/7 18:25
 * description:用户完成一定次数的抽奖后，解锁的新奖品$
 */
@Slf4j
@Component
@LogicStrategy(logicMode = DefaultLogicFactory.LogicModel.RULE_LOCK)
public class RuleLockLogicFilter implements ILogicFilter<RuleActionEntity.RaffleCenterEntity> {

    @Resource
    private IStrategyRepository repository;

    /**
     * 用户抽奖次数
     */
    private Long userRaffleCount = 0L;
    @Override
    public RuleActionEntity<RuleActionEntity.RaffleCenterEntity> filter(RuleMatterEntity ruleMatterEntity) {

        log.info("规则过滤-次数锁 userId:{} strategyId:{} ruleModel:{}", ruleMatterEntity.getUserId(), ruleMatterEntity.getStrategyId(), ruleMatterEntity.getRuleModel());

        /**
         * 判断抽奖次数
         */
        String ruleValue = repository.queryStrategyRuleValue(ruleMatterEntity.getStrategyId(), ruleMatterEntity.getAwardId(), ruleMatterEntity.getRuleModel());

        long raffleCount = Long.parseLong(ruleValue);

        if (userRaffleCount >= raffleCount) {
            return RuleActionEntity.<RuleActionEntity.RaffleCenterEntity>builder()
                    .code(RuleLogicCheckTypeVO.ALLOW.getCode())
                    .info(RuleLogicCheckTypeVO.ALLOW.getInfo())
                    .build();
        }

        return RuleActionEntity.<RuleActionEntity.RaffleCenterEntity>builder()
                .code(RuleLogicCheckTypeVO.TAKE_OVER.getCode())
                .info(RuleLogicCheckTypeVO.TAKE_OVER.getInfo())
                .build();
    }
}
