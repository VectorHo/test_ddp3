package com.deepexi.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deepexi.project.domain.eo.AppbricksDepartment;
import com.deepexi.project.service.AppbricksDepartmentService;
import com.deepexi.project.mapper.AppbricksDepartmentMapper;
import java.util.Arrays;import java.util.List;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanPowerHelper;
import java.util.Arrays;

@Service
public class AppbricksDepartmentServiceImpl implements AppbricksDepartmentService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AppbricksDepartmentMapper appbricksDepartmentMapper;

    @Override
    public PageBean<AppbricksDepartment> findPage(AppbricksDepartment eo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<AppbricksDepartment> pages =  appbricksDepartmentMapper.findList(eo);
        return new PageBean<AppbricksDepartment>(pages);
    }

    @Override
    public List<AppbricksDepartment> findAll(AppbricksDepartment eo) {
        List<AppbricksDepartment> list = appbricksDepartmentMapper.findList(eo);
        return list;
    }
    @Override
    public AppbricksDepartment detail(String pk) {
        AppbricksDepartment eo = appbricksDepartmentMapper.selectById(pk);
        return eo;
    }

    @Override
    public Boolean update(String id,AppbricksDepartment eo) {
        AppbricksDepartment old = appbricksDepartmentMapper.selectById(id);
        BeanPowerHelper.mapCompleteOverrider(eo,old); //部分更新
        int result = appbricksDepartmentMapper.updateById(old);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean create(AppbricksDepartment eo) {
        int result = appbricksDepartmentMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String pk) {
        int result = appbricksDepartmentMapper.deleteBatchIds(Arrays.asList(pk));
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pks) {
        int result = appbricksDepartmentMapper.deleteBatchIds(Arrays.asList(pks));
        if (result > 0) {
            return true;
        }
        return false;
    }

}