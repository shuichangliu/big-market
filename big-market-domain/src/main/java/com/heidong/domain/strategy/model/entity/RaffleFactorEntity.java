package com.heidong.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/1 19:43
 * description:抽奖因子$
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RaffleFactorEntity {

    /** 用户id*/
    private String userId;
    /** 策略id*/
    private Long strategyId;
    /** 奖品id*/
    private Integer awardId;
}
