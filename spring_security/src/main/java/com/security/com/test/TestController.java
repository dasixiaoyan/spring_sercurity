package com.security.com.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试")
public class TestController {
    @ApiOperation(value = "ok")
    @GetMapping("/ok")
    public String test(){
        return "终于成功了";
    }

    @GetMapping("/kill")
    @ApiOperation(value = "kill")
    public String kill(){
        return "先再服务器kill进程>>>>再进行打包上线测试>>>>终于成功了";
    }


    @PostMapping("/success")
    @ApiOperation(value = "success")
    @ApiImplicitParam(name = "name",value = "haha",paramType = "query",dataType = "String")
    public String success(@RequestParam("name") String name){

        return name;
    }
}
