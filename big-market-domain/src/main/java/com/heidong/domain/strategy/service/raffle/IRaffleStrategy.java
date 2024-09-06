package com.heidong.domain.strategy.service.raffle;

import com.heidong.domain.strategy.model.entity.RaffleAwardEntity;
import com.heidong.domain.strategy.model.entity.RaffleFactorEntity;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/9/1 19:42
 * description:抽奖策略接口$
 */
public interface IRaffleStrategy {

    RaffleAwardEntity performRaffle(RaffleFactorEntity raffleFactorEntity);
}
