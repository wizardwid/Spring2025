package kr.hs.study.FirstBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class HomeController {
    @GetExchange("/")
    public String home(){
        return "index";
    }
}
