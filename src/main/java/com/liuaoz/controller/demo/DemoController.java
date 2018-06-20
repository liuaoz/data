package com.liuaoz.controller.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by matrix_stone on 2018/6/20.
 */
@RestController
@RequestMapping("/")
@Slf4j
public class DemoController {

    @GetMapping("test")
    public ResponseEntity<String> test(){
        log.info("demo test success.");
        return ResponseEntity.ok("demo test success.");
    }
}
