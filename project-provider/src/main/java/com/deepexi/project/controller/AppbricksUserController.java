package com.deepexi.project.controller;

import com.deepexi.util.config.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.deepexi.project.service.AppbricksUserService;
import com.deepexi.project.domain.eo.AppbricksUser;
import org.springframework.web.bind.annotation.*;
//import io.swagger.annotations.*;


//@Api(value = "/appbricks_user", description = "$desc")
@RestController
@RequestMapping("/api/v1/appbricksUsers")
public class  AppbricksUserController {

    @Autowired
    private AppbricksUserService appbricksUserService;


    @GetMapping
    //@ApiOperation(value = "分页查询", notes = "分页请求")
    public  Payload findPage(AppbricksUser eo,
                             @RequestParam(value = "page", defaultValue = "0") Integer page,
                             @RequestParam(value = "size", defaultValue = "10") Integer size) {
        return new Payload(appbricksUserService.findPage(eo, page, size));
    }

    @GetMapping("/list")
    //@ApiOperation(value = "树形查询", notes = "查询全部请求")
    public Payload findAll(AppbricksUser eo) {
        return new Payload(appbricksUserService.findAll(eo));
    }

    @GetMapping("/{id}")
    public Payload detail(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(appbricksUserService.detail(pk));
    }


    @PutMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id修改", notes = "根据id修改AppbricksUser")
    public Payload update(@PathVariable(value = "id", required = true) String pk, @RequestBody AppbricksUser eo) {
     eo.setId(pk);
     return new Payload(appbricksUserService.update(pk, eo));
    }

    @PostMapping
    //@ApiOperation(value = "创建AppbricksUser", notes = "创建AppbricksUser")
    public Payload create(@RequestBody AppbricksUser eo) {
        return new Payload(appbricksUserService.create(eo));
    }

    @DeleteMapping("/{id}")
    @Transactional
//@ApiOperation(value = "根据id删除AppbricksUser", notes = "根据id删除AppbricksUser")
    public Payload delete(@PathVariable(value = "id", required = true) String pk) {
        return new Payload(appbricksUserService.delete(pk));
    }

    @DeleteMapping
    @Transactional
    //@ApiOperation(value = "根据id批量删除AppbricksUser", notes = "根据id批量删除AppbricksUser")
    public Payload delete(@RequestParam(required = true) String[] ids) {
        return new Payload(appbricksUserService.delete(ids));
    }

}