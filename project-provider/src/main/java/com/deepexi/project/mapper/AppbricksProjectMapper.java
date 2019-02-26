package com.deepexi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.project.domain.eo.AppbricksProject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  AppbricksProjectMapper extends BaseMapper<AppbricksProject> {

    List<AppbricksProject> findList(@Param("eo")  AppbricksProject eo);

    int deleteByIds(@Param("ids") List<Integer > ids);

}