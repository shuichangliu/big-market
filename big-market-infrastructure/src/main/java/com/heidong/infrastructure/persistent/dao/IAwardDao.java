package com.heidong.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/19 18:40
 * description:奖品表dao
 */
@Mapper
public interface IAwardDao {
    List<IAwardDao> queryAwardList();
}
