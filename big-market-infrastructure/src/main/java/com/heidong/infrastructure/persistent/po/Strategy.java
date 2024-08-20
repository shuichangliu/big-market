package com.heidong.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/9 21:12
 * description:抽奖策略$
 */
@Data
public class Strategy {

    /** 自增ID */
    private Long  id;
    /** 抽奖策略ID */
    private Long  strategyId;
    /** 抽奖策略描述 */
    private String  strategyDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
