package com.heidong.domain.strategy.model.entity;

import com.heidong.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/30 22:20
 * description:策略实体$
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StrategyEntity {
    /** 抽奖策略ID */
    private Long  strategyId;
    /** 抽奖策略描述 */
    private String  strategyDesc;
    /** 抽奖规则模型 */
    private String ruleModels;


    //获取规则模型
    public String[] ruleModels() {
        if (!StringUtils.hasLength(ruleModels)) return null;
        return ruleModels.split(Constants.SPLIT);
    }
    //获取规则模型权重
    public String getRuleWeight() {
        String[] ruleModels = this.ruleModels();
        if (null == ruleModels) return null;
        for (String ruleModel : ruleModels) {
            if ("rule_weight".equals(ruleModel)) return ruleModel;
        }
        return null;
    }
}


