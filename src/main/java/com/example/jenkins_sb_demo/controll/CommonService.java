package com.example.jenkins_sb_demo.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 游客 on 2019-12-03
 * Description:
 */
@RestController
@RequestMapping("/")
public class CommonService {
    @GetMapping("/index")
    public Map index() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "hello, welcome");
        map.put("obj", null);
        return map;
    }
}
