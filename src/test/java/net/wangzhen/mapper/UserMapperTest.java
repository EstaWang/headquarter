package net.wangzhen.mapper;

import net.wangzhen.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by estaw on 2017/10/12.
 * email: zhen.wang@dianrong.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aaa", "ccc", Boolean.TRUE));

        Assert.assertEquals(1, userMapper.getAll().size());
    }



}
