package tech.shop.ease.fresh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("new")
public class HelloController {
    @GetMapping("test")
    public String test() {
        return "启动愉快";
    }
}
