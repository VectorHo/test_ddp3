package com.deepexi.project.service;

import com.deepexi.project.domain.eo.AppbricksUser;
import com.deepexi.project.domain.dto.AppbricksUserDto;
import com.deepexi.util.pageHelper.PageBean;
import java.util.List;

/**
 * appbricks_user
 */
public interface AppbricksUserService {

    /**
    * 分页获取列表
    * @param eo
    * @param page
    * @param size
    * @return
    */
    PageBean<AppbricksUser> findPage(AppbricksUser eo, Integer page, Integer size);
    /**
    * 获取列表
    * @return
    */
    List<AppbricksUser> findAll(AppbricksUser eo);

    /**
      获取详情
    * @return
    */
    AppbricksUser detail(String pk);

    /**
     更新eo
    * @param eo
    * @return
    */
    Boolean update(String id,AppbricksUser eo);

    /**
    * 创建eo
    * @param eo
    * @return
    */
    Boolean create(AppbricksUser eo);

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