package kr.hs.study.Board.Controller;

import kr.hs.study.Board.DTO.boardDTO;
import kr.hs.study.Board.Service.boardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class boardController {
    @Autowired
    private boardService service;

    @GetMapping("/board/save")
    public String write(){
        return "write_form";
    }

    @PostMapping("/write")
    public String writeValue(boardDTO dto){
        System.out.println(dto.getBoardWriter());
        System.out.println(dto.getBoardPass());
        System.out.println(dto.getBoardTitle());
        System.out.println(dto.getBoardContents());
        service.insert(dto);
        return "redirect:/";
    }
}
