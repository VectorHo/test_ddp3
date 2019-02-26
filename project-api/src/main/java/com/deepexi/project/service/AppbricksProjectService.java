package com.deepexi.project.service;

import com.deepexi.project.domain.eo.AppbricksProject;
import com.deepexi.project.domain.dto.AppbricksProjectDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * appbricks_project
 */
public interface AppbricksProjectService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<AppbricksProject> findPage(AppbricksProject eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<AppbricksProject> findAll(AppbricksProject eo);

    /**
      获取详情
    * @return
    */
    AppbricksProject detail(Integer  pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(Integer  id,AppbricksProject eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(AppbricksProject eo);

    /**
     * 单个删除
    * @return
    */
    Boolean delete(Integer  pk);

    /**
     批量删除
    * @return
    */
    Boolean delete(Integer ...pk);
}