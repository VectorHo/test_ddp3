package com.deepexi.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.project.domain.eo.AppbricksUser;
import com.deepexi.project.service.AppbricksUserService;
import com.deepexi.project.mapper.AppbricksUserMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class AppbricksUserServiceImpl implements AppbricksUserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppbricksUserMapper appbricksUserMapper;

    @Override
    public PageBean<AppbricksUser> findPage(AppbricksUser eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<AppbricksUser> pages =  appbricksUserMapper.findList(eo);
        return new PageBean<AppbricksUser>(pages);
    }

    @Override
    public List<AppbricksUser> findAll(AppbricksUser eo) {
        List<AppbricksUser> list = appbricksUserMapper.findList(eo);
        return list;
    }
    @Override
    public AppbricksUser detail(String pk) {
        AppbricksUser eo = appbricksUserMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,AppbricksUser eo) {
        AppbricksUser old = appbricksUserMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = appbricksUserMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(AppbricksUser eo) {
        int result = appbricksUserMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = appbricksUserMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = appbricksUserMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}