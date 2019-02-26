package com.deepexi.project.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.project.service.AppbricksProjectService;
import com.deepexi.project.domain.eo.AppbricksProject;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/appbricks_project", description = "$desc")
@RestController
@RequestMapping("/api/v1/appbricksProjects")
public class  AppbricksProjectController {

    @Autowired
    private AppbricksProjectService appbricksProjectService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(AppbricksProject eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(appbricksProjectService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(AppbricksProject eo) {
        return new Payload(appbricksProjectService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(appbricksProjectService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改AppbricksProject")
    public Payload update(@PathVariable(value = "id", required = true) Integer  pk, @RequestBody AppbricksProject eo) {
     eo.setId(pk);
     return new Payload(appbricksProjectService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建AppbricksProject", notes = "创建AppbricksProject")
    public Payload create(@RequestBody AppbricksProject eo) {
        return new Payload(appbricksProjectService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除AppbricksProject", notes = "根据id删除AppbricksProject")
    public Payload delete(@PathVariable(value = "id", required = true) Integer  pk) {
        return new Payload(appbricksProjectService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除AppbricksProject", notes = "根据id批量删除AppbricksProject")
    public Payload delete(@RequestParam(required = true) Integer [] ids) {
        return new Payload(appbricksProjectService.delete(ids));
    }

}