package com.team.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.team.em.entity.SysFile;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户上传文件 持久层（mapper）
 *
 */
@Mapper
public interface FileMapper extends BaseMapper<SysFile> {
}
