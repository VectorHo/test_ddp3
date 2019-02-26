package com.deepexi.project.domain.eo;


import java.util.Date;
import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Collection;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
* @desc appbricks_project
* @author admin
*/
//@ApiModel(description = "appbricks_project")
public class AppbricksProject{

// @ApiModelProperty(value = "主键ID")
    @TableId
    @TableField(value = "`id`")
    private Integer  id;
// @ApiModelProperty(value = "创建人ID")
    @TableField(value = "`create_person_id`")
    private String createPersonId;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "名称")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "项目标识")
    @TableField(value = "`project_no`")
    private String projectNo;
// @ApiModelProperty(value = "更新人ID")
    @TableField(value = "`update_person_id`")
    private String updatePersonId;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "是否为平台项目")
    @TableField(value = "`system_project`")
    private String systemProject;
// @ApiModelProperty(value = "用户来源")
    @TableField(value = "`user_source`")
    private String userSource;
// @ApiModelProperty(value = "租户标识")
    @TableField(value = "`tenant_code`")
    private String tenantCode;
// @ApiModelProperty(value = "状态")
    @TableField(value = "`status`")
    private String status;
// @ApiModelProperty(value = "备用字段（项目类型）")
    @TableField(value = "`attribute1`")
    private String attribute1;
// @ApiModelProperty(value = "删除标记")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;

    public void setId(Integer  id){
    this.id = id;
    }

    public Integer  getId(){
    return this.id;
    }

    public void setCreatePersonId(String createPersonId){
    this.createPersonId = createPersonId;
    }

    public String getCreatePersonId(){
    return this.createPersonId;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }

    public void setUpdatePersonId(String updatePersonId){
    this.updatePersonId = updatePersonId;
    }

    public String getUpdatePersonId(){
    return this.updatePersonId;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setSystemProject(String systemProject){
    this.systemProject = systemProject;
    }

    public String getSystemProject(){
    return this.systemProject;
    }

    public void setUserSource(String userSource){
    this.userSource = userSource;
    }

    public String getUserSource(){
    return this.userSource;
    }

    public void setTenantCode(String tenantCode){
    this.tenantCode = tenantCode;
    }

    public String getTenantCode(){
    return this.tenantCode;
    }

    public void setStatus(String status){
    this.status = status;
    }

    public String getStatus(){
    return this.status;
    }

    public void setAttribute1(String attribute1){
    this.attribute1 = attribute1;
    }

    public String getAttribute1(){
    return this.attribute1;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }


}

