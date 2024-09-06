package com.heidong.test.domain;

import com.heidong.domain.strategy.service.armory.IStrategyArmory;
import com.heidong.domain.strategy.service.armory.IStrategyDispatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/28 21:26
 * description:$
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyArmoryTest {

    @Resource
    private IStrategyDispatch strategyDispatch;
    @Resource
    private IStrategyArmory strategyArmory;

    @Before
    public void test_strategyArmory(){
        boolean success = strategyArmory.assembleLotteryStrategy(100001L);
        log.info("测试结果：{}",success);

    }

    @Test
    public void test_getRandomAwardId_ruleWeightValue() {
        log.info("测试结果：{} - 4000 策略配置", strategyDispatch.getRandomAwardId(100001L, "4000:102,103,104,105"));
        log.info("测试结果：{} - 5000 策略配置", strategyDispatch.getRandomAwardId(100001L, "5000:102,103,104,105,106,107"));
        log.info("测试结果：{} - 6000 策略配置", strategyDispatch.getRandomAwardId(100001L, "6000:102,103,104,105,106,107,108,109"));
//        log.info("测试结果：{} - 6000 策略配置", strategyDispatch.getRandomAwardId(100002L));
    }
}
