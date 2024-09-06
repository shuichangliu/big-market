package com.heidong.infrastructure.persistent.dao;

import com.heidong.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/19 18:41
 * description:抽奖策略Dao$
 */
@Mapper
public interface IStrategyDao {
    //查询抽奖策略
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
