package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyang
 * @date 2021/5/1419:32
 * @description HelloWordController TODO
 */
@RestController
public class HelloWordController {

    /**
     * @author yangyang
     * @date ${date} ${time}
     * @description TODO
     */
    @RequestMapping("/hello")
    public String hello(){

        System.out.printf("hello word");
        return "hello word";
    }
}
