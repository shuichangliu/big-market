package com.heidong.test.infrastructure;

import com.alibaba.fastjson.JSON;
import com.heidong.infrastructure.persistent.dao.IAwardDao;
import com.heidong.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * projectName：big-market
 *
 * @author 杨晓飞
 * @date 2024/8/20 14:45
 * description:奖品持久层测试$
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {

    @Resource
    private IAwardDao awardDao;

    @Test
    public void test_queryAwardList() {
        List<Award> awards = awardDao.queryAwardList();
        log.info("测试结果:{}", JSON.toJSONString(awards));
    }

}
