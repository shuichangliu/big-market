package com.heidong.domain.strategy.model.vo;

import com.heidong.domain.strategy.service.rule.factory.DefaultLogicFactory;
import com.heidong.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/7 19:25
 * description:抽奖策略规则规则值对象；值对象，没有唯一ID，仅限于从数据库查询对象$
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {

    private String ruleModels;

    public String[] raffleCenterRuleModelList(){
        List<String> ruleModelList = new ArrayList<>();
        String[] ruleModelValues = ruleModels.split(Constants.SPLIT);
        for (String ruleModelValue : ruleModelValues) {
            if(DefaultLogicFactory.LogicModel.isCenter(ruleModelValue)){
                ruleModelList.add(ruleModelValue);
            }
        }
        return ruleModelList.toArray(new String[0]);
    }
}

