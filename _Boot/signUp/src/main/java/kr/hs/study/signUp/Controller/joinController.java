package kr.hs.study.signUp.Controller;

import kr.hs.study.signUp.DTO.joinDTO;
import kr.hs.study.signUp.Service.joinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class joinController {
    @Autowired
    private joinService service;

    @PostMapping("/join")
    public void signUp(joinDTO dto){
        service.save(dto);
    }
}
