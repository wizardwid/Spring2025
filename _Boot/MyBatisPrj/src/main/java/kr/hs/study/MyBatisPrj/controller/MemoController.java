package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.DTO.memoDTO;
import kr.hs.study.MyBatisPrj.Service.MemoService;
import kr.hs.study.MyBatisPrj.Service.MemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemoController {
    @Autowired
    private MemoService service;

    @GetMapping("/Memo")
    public String memo(Model model) {
        List<memoDTO> all = service.listAll();
        model.addAttribute("data", all);
        System.out.println("size : " + all.size());
        return "memo_list";
    }

    @PostMapping("/memo2")
    public String insert(memoDTO dto){
        service.insert(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/memo/list")
    public String listAll(Model model){
        List<memoDTO> all = service.listAll();
        model.addAttribute("data", all);
        System.out.println("size : " + all.size());
        return "memo_result";
    }

    @GetMapping("/edit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model) {
        System.out.println("idx : " + idx);
        service.selectOne(idx);
        memoDTO dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String edit(memoDTO dto){
        service.update(dto);
        return "redirect:/Memo";
    }

    @GetMapping("/delete/{idx}")
    public String delete(@PathVariable("idx") int idx){
        service.delete(idx);
        return "redirect:/Memo";
    }
}
