package tech.shop.ease.module.auth.controller;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ftl")
public class WelcomeController {

    // http://localhost:8101/api/ftl/welcome
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("name", "Spring Boot");
        return "welcome";
    }
}
