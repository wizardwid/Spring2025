package kr.hs.study.LoginSimple.controller;

import kr.hs.study.LoginSimple.DTO.loginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.swing.*;

@Controller
public class LoginController {
    public String id = "lay";
    public String pass = "1111";
    public String result;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/test1")
    public String test1(loginDTO dto, Model model) {
        if (id.equals(dto.getId()) && pass.equals(dto.getPass())) {
            result = "login!!";
        } else {
            result = "not login";
        }
        model.addAttribute("dto", result);
        return "result";
    }
}
