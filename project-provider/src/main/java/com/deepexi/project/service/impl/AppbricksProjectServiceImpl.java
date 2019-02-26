package com.deepexi.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.project.domain.eo.AppbricksProject;
import com.deepexi.project.service.AppbricksProjectService;
import com.deepexi.project.mapper.AppbricksProjectMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class AppbricksProjectServiceImpl implements AppbricksProjectService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppbricksProjectMapper appbricksProjectMapper;

    @Override
    public PageBean<AppbricksProject> findPage(AppbricksProject eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<AppbricksProject> pages =  appbricksProjectMapper.findList(eo);
        return new PageBean<AppbricksProject>(pages);
    }

    @Override
    public List<AppbricksProject> findAll(AppbricksProject eo) {
        List<AppbricksProject> list = appbricksProjectMapper.findList(eo);
        return list;
    }
    @Override
    public AppbricksProject detail(Integer  pk) {
        AppbricksProject eo = appbricksProjectMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(Integer  id,AppbricksProject eo) {
        AppbricksProject old = appbricksProjectMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = appbricksProjectMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(AppbricksProject eo) {
        int result = appbricksProjectMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer  pk) {
        int result = appbricksProjectMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer ...pks) {
        int result = appbricksProjectMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}