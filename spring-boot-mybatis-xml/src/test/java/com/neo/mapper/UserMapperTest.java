package com.neo.mapper;

import com.neo.entity.UserEntity;
import com.neo.enums.UserSexEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @package: com.neo.mapper
 * @data: 2018/7/5
 * @author: 70918
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert(){
        userMapper.insert(new UserEntity("aa","12345467",UserSexEnum.MAN));
    }

}