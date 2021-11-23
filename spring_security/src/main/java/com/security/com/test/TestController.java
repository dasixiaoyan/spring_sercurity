package com.security.com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/ok")
    public String test(){
        return "终于成功了";
    }

    @GetMapping("/kill")
    public String kill(){
        return "先再服务器kill进程>>>>再进行打包上线测试>>>>终于成功了";
    }
}
