package kr.hs.study.firstJPA.Controller;

import kr.hs.study.firstJPA.DTO.memoDTO;
import kr.hs.study.firstJPA.Service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class memoController {
    @Autowired
    private memoService service;

    @GetMapping("/add")
    public String dataAdd(){
        return "inputForm";
    }

    @PostMapping("/input")
    public void dataInput(memoDTO dto){
        service.save(dto);
    }

    @GetMapping("/list")
    public String findAll(Model model){
        List<memoDTO> list = service.findAll();
        model.addAttribute("one", list);
        return "data_list";
    }
}
