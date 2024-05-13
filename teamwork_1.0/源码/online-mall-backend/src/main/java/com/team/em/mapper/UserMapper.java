package com.team.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.team.em.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层 （mapper）
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
