package com.deepexi.project.service;

import com.deepexi.project.domain.eo.AppbricksDepartment;
import com.deepexi.project.domain.dto.AppbricksDepartmentDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * appbricks_department
 */
public interface AppbricksDepartmentService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<AppbricksDepartment> findPage(AppbricksDepartment eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<AppbricksDepartment> findAll(AppbricksDepartment eo);

    /**
      获取详情
    * @return
    */
    AppbricksDepartment detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,AppbricksDepartment eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(AppbricksDepartment eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(String pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(String...pk);
}