package com.deepexi.project.domain.dto;

import com.deepexi.project.domain.eo.AppbricksProject;
import java.util.Collection;
import java.util.List;

/**
* @desc appbricks_project
* @author admin
*/
public class AppbricksProjectDto extends AppbricksProject{

public AppbricksProjectDto(){};

public AppbricksProjectDto(AppbricksProject eo) {
    this.setId(eo.getId());
    this.setCreatePersonId(eo.getCreatePersonId());
    this.setCreateTime(eo.getCreateTime());
    this.setName(eo.getName());
    this.setProjectNo(eo.getProjectNo());
    this.setUpdatePersonId(eo.getUpdatePersonId());
    this.setUpdateTime(eo.getUpdateTime());
    this.setSystemProject(eo.getSystemProject());
    this.setUserSource(eo.getUserSource());
    this.setTenantCode(eo.getTenantCode());
    this.setStatus(eo.getStatus());
    this.setAttribute1(eo.getAttribute1());
    this.setDr(eo.getDr());
}
}

