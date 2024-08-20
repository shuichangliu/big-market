package com.heidong.infrastructure.persistent.dao;

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
    List<IStrategyDao> queryStrategyList();
}
