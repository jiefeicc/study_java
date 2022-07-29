package com.zhuwenjin.concurrent.controller;


import com.zhuwenjin.concurrent.service.AsyncTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/asyncTask")
public class AsyncTaskController {

    @Autowired
    AsyncTaskService asyncTaskService;

    @GetMapping("/task1")
    public String asyncTask1() {
        log.info("开始调用");
        asyncTaskService.asyncTask();
        log.info("完成调用");
        return "hello";
    }

}
