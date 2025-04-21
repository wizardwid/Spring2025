package kr.hs.study.MyBatisPrj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class T_TableController {
    public int result;

    @GetMapping("/t_table")
    public String ttable(){
        return "table_input";
    }

//    @PostMapping("/t_table2")
//    public ModelAndView ttable2(@RequestParam("id") int id) {
//        ModelAndView mav = new ModelAndView("result");
//        List<String> results = new ArrayList<>();
//
//        for (int i = 1; i <= 10; i++) {
//            int result = id * i;
//            results.add(id + " * " + i + " = " + result);
//        }
//
//        mav.addObject("results", results);
//        return mav;
//    }

    @PostMapping("/t_table2")
    public String ttable2(@RequestParam("id") int id, Model model) {
        List<String> results = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int result = id * i;
            results.add(id + " * " + i + " = " + result);
        }

         model.addAttribute("results", results);
        return "result";
    }
}
