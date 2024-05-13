package com.team.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.team.em.entity.Carousel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 轮播图 持久层（mapper）
 *
 */
@Mapper
public interface CarouselMapper extends BaseMapper<Carousel> {

    List<Carousel> findAllCarousel();
}
