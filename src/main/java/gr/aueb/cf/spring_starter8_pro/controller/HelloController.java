package gr.aueb.cf.spring_starter8_pro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/starter")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello Coding");
        return "index";

    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(defaultValue = "Guest") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome";
    }


}
