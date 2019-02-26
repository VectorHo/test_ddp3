package com.deepexi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.project.domain.eo.AppbricksDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface  AppbricksDepartmentMapper extends BaseMapper<AppbricksDepartment> {

    List<AppbricksDepartment> findList(@Param("eo")  AppbricksDepartment eo);

    int deleteByIds(@Param("ids") List<String> ids);

}