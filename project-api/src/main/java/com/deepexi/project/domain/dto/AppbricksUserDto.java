package com.deepexi.project.domain.dto;

import com.deepexi.project.domain.eo.AppbricksUser;
import java.util.Collection;
import java.util.List;

/**
* @desc appbricks_user
* @author admin
*/
public class AppbricksUserDto extends AppbricksUser{

public AppbricksUserDto(){};

public AppbricksUserDto(AppbricksUser eo) {
    this.setShopId(eo.getShopId());
    this.setJob(eo.getJob());
    this.setTenantCode(eo.getTenantCode());
    this.setWorkStatus(eo.getWorkStatus());
    this.setDr(eo.getDr());
    this.setId(eo.getId());
    this.setUsername(eo.getUsername());
    this.setUsernumber(eo.getUsernumber());
    this.setPassword(eo.getPassword());
    this.setToken(eo.getToken());
    this.setFullname(eo.getFullname());
    this.setFullnameEn(eo.getFullnameEn());
    this.setEmail(eo.getEmail());
    this.setGender(eo.getGender());
    this.setTel(eo.getTel());
    this.setWorkTel(eo.getWorkTel());
    this.setUpdateTime(eo.getUpdateTime());
    this.setUpdatePerson(eo.getUpdatePerson());
    this.setCreateTime(eo.getCreateTime());
    this.setCreatePerson(eo.getCreatePerson());
    this.setGuid(eo.getGuid());
    this.setCurrentProjectNo(eo.getCurrentProjectNo());
    this.setProjectNo(eo.getProjectNo());
    this.setStatus(eo.getStatus());
    this.setType(eo.getType());
    this.setAvatar(eo.getAvatar());
}
}

