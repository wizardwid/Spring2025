package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.DTO.loginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    public String id = "Jeong";
    public String pw = "1234";
    public String result;

    @GetMapping("/login")
    public String login1(){
        return "login_input";
    }

//    @PostMapping("/login2")
//    public ModelAndView score2(@ModelAttribute loginDTO dto){
//        ModelAndView mav = new ModelAndView("result_3");
//
//        if(id.equals(dto.getId()) && pw.equals(dto.getPw()))
//            result = "로그인 되었습니다.";
//        else if(id.equals(dto.getId()))
//            result = "비밀번호가 틀렸습니다.";
//        else if(pw.equals(dto.getPw()))
//            result = "아이디가 틀렸습니다.";
//        else
//            result = "로그인에 실패했습니다.";
//
//        mav.addObject("result", result);
//        return mav;
//    }

    @PostMapping("/login2")
    public String score2(@ModelAttribute loginDTO dto, Model model){
        if(id.equals(dto.getId()) && pw.equals(dto.getPw()))
            result = "로그인 되었습니다.";
        else if(id.equals(dto.getId()))
            result = "비밀번호가 틀렸습니다.";
        else if(pw.equals(dto.getPw()))
            result = "아이디가 틀렸습니다.";
        else
            result = "로그인에 실패했습니다.";

        model.addAttribute("result", result);
        return "result_3";
    }
}
