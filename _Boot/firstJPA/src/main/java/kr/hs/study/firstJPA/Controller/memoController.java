package kr.hs.study.firstJPA.Controller;

import kr.hs.study.firstJPA.DTO.memoDTO;
import kr.hs.study.firstJPA.Service.memoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
}
