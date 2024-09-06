package com.heidong.infrastructure.persistent.dao;

import com.heidong.infrastructure.persistent.po.Award;
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
    List<Award> queryAwardList();
}
