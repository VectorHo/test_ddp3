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
* @desc appbricks_user
* @author admin
*/
//@ApiModel(description = "appbricks_user")
public class AppbricksUser{

// @ApiModelProperty(value = "店铺id")
    @TableField(value = "`shop_id`")
    private String shopId;
// @ApiModelProperty(value = "职位")
    @TableField(value = "`job`")
    private String job;
// @ApiModelProperty(value = "租户编号")
    @TableField(value = "`tenant_code`")
    private String tenantCode;
// @ApiModelProperty(value = "工作状态，on/off")
    @TableField(value = "`work_status`")
    private String workStatus;
// @ApiModelProperty(value = "删除标记")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;
// @ApiModelProperty(value = "id")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "用户名")
    @TableField(value = "`username`")
    private String username;
// @ApiModelProperty(value = "工号")
    @TableField(value = "`usernumber`")
    private String usernumber;
// @ApiModelProperty(value = "密码")
    @TableField(value = "`password`")
    private String password;
// @ApiModelProperty(value = "登录token")
    @TableField(value = "`token`")
    private String token;
// @ApiModelProperty(value = "完整名称")
    @TableField(value = "`fullname`")
    private String fullname;
// @ApiModelProperty(value = "英文完整名称")
    @TableField(value = "`fullname_en`")
    private String fullnameEn;
// @ApiModelProperty(value = "邮件地址")
    @TableField(value = "`email`")
    private String email;
// @ApiModelProperty(value = "性别")
    @TableField(value = "`gender`")
    private String gender;
// @ApiModelProperty(value = "电话")
    @TableField(value = "`tel`")
    private String tel;
// @ApiModelProperty(value = "工作电话")
    @TableField(value = "`work_tel`")
    private String workTel;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "更新人")
    @TableField(value = "`update_person`")
    private String updatePerson;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "创建人")
    @TableField(value = "`create_person`")
    private String createPerson;
// @ApiModelProperty(value = "标识")
    @TableField(value = "`guid`")
    private String guid;
// @ApiModelProperty(value = "真实项目")
    @TableField(value = "`current_project_no`")
    private String currentProjectNo;
// @ApiModelProperty(value = "所在项目")
    @TableField(value = "`project_no`")
    private String projectNo;
// @ApiModelProperty(value = "状态")
    @TableField(value = "`status`")
    private String status;
// @ApiModelProperty(value = "类型")
    @TableField(value = "`type`")
    private String type;
// @ApiModelProperty(value = "头像")
    @TableField(value = "`avatar`")
    private String avatar;

    public void setShopId(String shopId){
    this.shopId = shopId;
    }

    public String getShopId(){
    return this.shopId;
    }

    public void setJob(String job){
    this.job = job;
    }

    public String getJob(){
    return this.job;
    }

    public void setTenantCode(String tenantCode){
    this.tenantCode = tenantCode;
    }

    public String getTenantCode(){
    return this.tenantCode;
    }

    public void setWorkStatus(String workStatus){
    this.workStatus = workStatus;
    }

    public String getWorkStatus(){
    return this.workStatus;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setUsername(String username){
    this.username = username;
    }

    public String getUsername(){
    return this.username;
    }

    public void setUsernumber(String usernumber){
    this.usernumber = usernumber;
    }

    public String getUsernumber(){
    return this.usernumber;
    }

    public void setPassword(String password){
    this.password = password;
    }

    public String getPassword(){
    return this.password;
    }

    public void setToken(String token){
    this.token = token;
    }

    public String getToken(){
    return this.token;
    }

    public void setFullname(String fullname){
    this.fullname = fullname;
    }

    public String getFullname(){
    return this.fullname;
    }

    public void setFullnameEn(String fullnameEn){
    this.fullnameEn = fullnameEn;
    }

    public String getFullnameEn(){
    return this.fullnameEn;
    }

    public void setEmail(String email){
    this.email = email;
    }

    public String getEmail(){
    return this.email;
    }

    public void setGender(String gender){
    this.gender = gender;
    }

    public String getGender(){
    return this.gender;
    }

    public void setTel(String tel){
    this.tel = tel;
    }

    public String getTel(){
    return this.tel;
    }

    public void setWorkTel(String workTel){
    this.workTel = workTel;
    }

    public String getWorkTel(){
    return this.workTel;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setUpdatePerson(String updatePerson){
    this.updatePerson = updatePerson;
    }

    public String getUpdatePerson(){
    return this.updatePerson;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setCreatePerson(String createPerson){
    this.createPerson = createPerson;
    }

    public String getCreatePerson(){
    return this.createPerson;
    }

    public void setGuid(String guid){
    this.guid = guid;
    }

    public String getGuid(){
    return this.guid;
    }

    public void setCurrentProjectNo(String currentProjectNo){
    this.currentProjectNo = currentProjectNo;
    }

    public String getCurrentProjectNo(){
    return this.currentProjectNo;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }

    public void setStatus(String status){
    this.status = status;
    }

    public String getStatus(){
    return this.status;
    }

    public void setType(String type){
    this.type = type;
    }

    public String getType(){
    return this.type;
    }

    public void setAvatar(String avatar){
    this.avatar = avatar;
    }

    public String getAvatar(){
    return this.avatar;
    }


}

