package com.heidong.infrastructure.persistent.dao;

import com.heidong.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/19 18:42
 * description:抽奖策略包括概率Dao
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
}
