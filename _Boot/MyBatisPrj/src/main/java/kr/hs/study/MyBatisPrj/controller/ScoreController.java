package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.DTO.scoreDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ScoreController {
    public int total;
    public float avg;

    @GetMapping("/score")
    public String score1() {
        return "score_input";
    }

//    @PostMapping("/score2")
//    public ModelAndView score2(@ModelAttribute scoreDTO dto){
//        ModelAndView mav = new ModelAndView("result_2");
//        List<String> results = new ArrayList<>();
//
//        total = dto.getKorean() + dto.getEnglish() + dto.getMath();
//        avg = (float)(dto.getKorean() + dto.getEnglish() + dto.getMath()) / 3;
//
//        results.add("이름 : " + dto.getName());
//        results.add("국어 : " + dto.getKorean());
//        results.add("영어 : " + dto.getEnglish());
//        results.add("수학 : " + dto.getMath());
//        results.add("총점 : " + total);
//        results.add("평균 : " + avg);
//
//        mav.addObject("results", results);
//        return mav;
//    }

    @PostMapping("/score2")
    public String score2 (@ModelAttribute scoreDTO dto, Model model){
        List<String> results = new ArrayList<>();

        int total = dto.getKorean() + dto.getEnglish() + dto.getMath();
        float avg = (float) total / 3;

        results.add("이름 : " + dto.getName());
        results.add("국어 : " + dto.getKorean());
        results.add("영어 : " + dto.getEnglish());
        results.add("수학 : " + dto.getMath());
        results.add("총점 : " + total);
        results.add("평균 : " + avg);

        model.addAttribute("results", results);
        return "result_2";
    }
}
