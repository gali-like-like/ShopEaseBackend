package tech.shop.ease;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.shop.ease.mbg.mapper.UserMapper;
import tech.shop.ease.mbg.model.entity.User;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    @Autowired
    UserMapper userMapper;

    @GetMapping
    public String test() {
        return "启动愉快";
    }
}
