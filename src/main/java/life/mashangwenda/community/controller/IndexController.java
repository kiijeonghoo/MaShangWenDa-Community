package life.mashangwenda.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Bukki
 * description:
 * date: 2020/8/9 15:52
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
