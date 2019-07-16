package com.zs.controller;

import com.zs.Result.PageResult;
import com.zs.Result.Result;
import com.zs.service.LableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Lable")
public class LableController {
    @Autowired
    private LableService lableService;


    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, 2001,"查询成功",lableService.findAll());
    }

    @GetMapping(value = "findByIdFromRedis/id")
    public Result findByIdFromRedis(@PathVariable String id){
        return new Result(true,2001,"缓存查询成功",lableService.findByLableIdFromRedis(id));
    }

}
