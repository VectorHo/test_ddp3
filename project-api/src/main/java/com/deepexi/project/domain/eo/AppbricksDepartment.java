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
* @desc appbricks_department
* @author admin
*/
//@ApiModel(description = "appbricks_department")
public class AppbricksDepartment{

// @ApiModelProperty(value = "主键ID")
    @TableId
    @TableField(value = "`id`")
    private String id;
// @ApiModelProperty(value = "名称")
    @TableField(value = "`name`")
    private String name;
// @ApiModelProperty(value = "英文名称")
    @TableField(value = "`name_en`")
    private String nameEn;
// @ApiModelProperty(value = "编码")
    @TableField(value = "`code`")
    private String code;
// @ApiModelProperty(value = "父级ID")
    @TableField(value = "`parent_id`")
    private String parentId;
// @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`update_time`")
    private Date updateTime;
// @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "`create_time`")
    private Date createTime;
// @ApiModelProperty(value = "项目标识")
    @TableField(value = "`project_no`")
    private String projectNo;
// @ApiModelProperty(value = "店铺ID")
    @TableField(value = "`shop_id`")
    private String shopId;
// @ApiModelProperty(value = "是否为店铺管理员")
    @TableField(value = "`is_shop_root`")
    private Integer  isShopRoot;
// @ApiModelProperty(value = "租户编码")
    @TableField(value = "`tenant_code`")
    private String tenantCode;
// @ApiModelProperty(value = "删除标记")
    @TableLogic
    @TableField(value = "`dr`")
    private Boolean dr;

    public void setId(String id){
    this.id = id;
    }

    public String getId(){
    return this.id;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
    return this.name;
    }

    public void setNameEn(String nameEn){
    this.nameEn = nameEn;
    }

    public String getNameEn(){
    return this.nameEn;
    }

    public void setCode(String code){
    this.code = code;
    }

    public String getCode(){
    return this.code;
    }

    public void setParentId(String parentId){
    this.parentId = parentId;
    }

    public String getParentId(){
    return this.parentId;
    }

    public void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    public Date getUpdateTime(){
    return this.updateTime;
    }

    public void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    public Date getCreateTime(){
    return this.createTime;
    }

    public void setProjectNo(String projectNo){
    this.projectNo = projectNo;
    }

    public String getProjectNo(){
    return this.projectNo;
    }

    public void setShopId(String shopId){
    this.shopId = shopId;
    }

    public String getShopId(){
    return this.shopId;
    }

    public void setIsShopRoot(Integer  isShopRoot){
    this.isShopRoot = isShopRoot;
    }

    public Integer  getIsShopRoot(){
    return this.isShopRoot;
    }

    public void setTenantCode(String tenantCode){
    this.tenantCode = tenantCode;
    }

    public String getTenantCode(){
    return this.tenantCode;
    }

    public void setDr(Boolean dr){
    this.dr = dr;
    }

    public Boolean getDr(){
    return this.dr;
    }


}

