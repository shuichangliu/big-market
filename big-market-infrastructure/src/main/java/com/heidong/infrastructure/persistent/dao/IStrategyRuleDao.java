package com.heidong.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/19 18:43
 * description:抽奖规则Dao$
 */
@Mapper
public interface IStrategyRuleDao {
    List<IStrategyRuleDao> queryStrategyRuleList();
}
