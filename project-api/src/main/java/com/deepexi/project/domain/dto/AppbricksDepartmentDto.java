package com.deepexi.project.domain.dto;

import com.deepexi.project.domain.eo.AppbricksDepartment;
import java.util.Collection;
import java.util.List;

/**
* @desc appbricks_department
* @author admin
*/
public class AppbricksDepartmentDto extends AppbricksDepartment{

public AppbricksDepartmentDto(){};

public AppbricksDepartmentDto(AppbricksDepartment eo) {
    this.setId(eo.getId());
    this.setName(eo.getName());
    this.setNameEn(eo.getNameEn());
    this.setCode(eo.getCode());
    this.setParentId(eo.getParentId());
    this.setUpdateTime(eo.getUpdateTime());
    this.setCreateTime(eo.getCreateTime());
    this.setProjectNo(eo.getProjectNo());
    this.setShopId(eo.getShopId());
    this.setIsShopRoot(eo.getIsShopRoot());
    this.setTenantCode(eo.getTenantCode());
    this.setDr(eo.getDr());
}
}

