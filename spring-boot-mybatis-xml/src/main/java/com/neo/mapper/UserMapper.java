package com.neo.mapper;

import com.neo.entity.UserEntity;
import com.neo.param.UserParam;

import java.util.List;

/**
 * @package: com.neo.mapper
 * @data: 2018/7/4
 * @author: 70918
 */
public interface UserMapper {
    List<UserEntity> getAll();

    List<UserEntity> getList(UserParam userParam);

    int getCount(UserParam userParam);

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    int update(UserEntity user);

    int delete(Long id);
}
