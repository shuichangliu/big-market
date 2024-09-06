package com.heidong.domain.strategy.model.entity;

import com.heidong.domain.strategy.model.vo.RuleLogicCheckTypeVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/5 20:13
 * description:抽奖规则动作实体$
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RuleActionEntity<T extends RuleActionEntity.RaffleEntity> {

    private String code = RuleLogicCheckTypeVO.ALLOW.getCode();
    private String info = RuleLogicCheckTypeVO.ALLOW.getInfo();
    private String ruleModel;
    private T data;
    /**
     * 抽奖实体
     */
    static public class RaffleEntity {

    }

    /**
     * 抽奖前的实体
     */
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static public class RaffleBeforeEntity extends RaffleEntity {
        /**
         * 策略ID
         */
        private Long strategyId;

        /**
         * 权重值Key；用于抽奖时可以选择权重抽奖。
         */
        private String ruleWeightValueKey;

        /**
         * 奖品ID；
         */
        private Integer awardId;
    }

    /**
     * 抽奖中的实体
     */
    static public class RaffleCenterEntity extends RaffleEntity {

    }

    /**
     * 抽奖后的实体
     */
    static public class RaffleAfterEntity extends RaffleEntity {

    }
}
