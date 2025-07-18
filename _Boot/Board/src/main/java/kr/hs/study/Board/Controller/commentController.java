package kr.hs.study.Board.Controller;

import kr.hs.study.Board.DTO.commentDTO;
import kr.hs.study.Board.Service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class commentController {
    @Autowired
    public commentService service;

    @PostMapping("/comWrite")
    public String commentWrite(commentDTO dto){
        service.insert(dto);
        return "redirect:/";
    }
}
