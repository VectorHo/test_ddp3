package com.deepexi.project.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.project.service.AppbricksDepartmentService;
import com.deepexi.project.domain.eo.AppbricksDepartment;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/appbricks_department", description = "$desc")
@RestController
@RequestMapping("/api/v1/appbricksDepartments")
public class  AppbricksDepartmentController {

    @Autowired
    private AppbricksDepartmentService appbricksDepartmentService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(AppbricksDepartment eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(appbricksDepartmentService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(AppbricksDepartment eo) {
        return new Payload(appbricksDepartmentService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(appbricksDepartmentService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改AppbricksDepartment")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody AppbricksDepartment eo) {
     eo.setId(pk);
     return new Payload(appbricksDepartmentService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建AppbricksDepartment", notes = "创建AppbricksDepartment")
    public Payload create(@RequestBody AppbricksDepartment eo) {
        return new Payload(appbricksDepartmentService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除AppbricksDepartment", notes = "根据id删除AppbricksDepartment")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(appbricksDepartmentService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除AppbricksDepartment", notes = "根据id批量删除AppbricksDepartment")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(appbricksDepartmentService.delete(ids));
    }

}