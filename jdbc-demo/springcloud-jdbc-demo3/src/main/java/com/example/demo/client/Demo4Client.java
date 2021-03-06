package com.example.demo.client;

import com.example.demo.config.MyConfiguration;
import com.example.demo.entity.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "demo4",configuration = MyConfiguration.class)
public interface Demo4Client {


    @RequestMapping("/demo/list")
    List<Test> list();


    @RequestMapping("/demo/save")
    int save();
}
