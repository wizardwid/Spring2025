package kr.hs.study.signUp.Controller;

import kr.hs.study.signUp.DTO.joinDTO;
import kr.hs.study.signUp.Service.joinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class joinController {
    @Autowired
    private joinService service;

    @GetMapping("/signUp")
    public String joinForm(){
        return "join_form";
    }

    @GetMapping("/list")
    public String memberList(Model model){
        List<joinDTO> list =service.findAll();
        model.addAttribute("data", list);
        return "member_list";
    }

    @PostMapping("/join")
    public String signUp(joinDTO dto){
        service.save(dto);
        return "redirect:/";
    }
}
