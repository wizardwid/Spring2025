package kr.hs.study.Board.Controller;

import kr.hs.study.Board.DTO.boardDTO;
import kr.hs.study.Board.DTO.commentDTO;
import kr.hs.study.Board.Service.boardService;
import kr.hs.study.Board.Service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class boardController {
    @Autowired
    private boardService service;
    @Autowired
    private commentService cService;

    @GetMapping("/")
    public String board(Model model){
        List<boardDTO> all = service.listAll();
        model.addAttribute("data", all);
        return "index";
    }

    @GetMapping("/board")
    public String board_list(Model model){
        List<boardDTO> all = service.listAll();
        model.addAttribute("data", all);
        return "board_list";
    }

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

    @GetMapping("/select/{id}")
    public String selectOne(@PathVariable("id") int id, Model model){
        boardDTO dto = service.selectOne(id);
        int hit = dto.getBoardHits() + 1;
        service.update_Hits(id, hit);
        List<commentDTO> cDto = cService.listAll(id);
        model.addAttribute("one", dto);
        model.addAttribute("cOne", cDto);
        return "board_view";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        boardDTO dto = service.selectOne(id);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/edit")
    public String edit(boardDTO dto,
                       @RequestParam("id") int id,
                       @RequestParam("boardPass") String boardPass,
                       Model model){
        if(dto.getBoardPass().equals(service.selectPw(dto.getId()))){
            service.update(dto);
            return "redirect:/";
        }
        else{
            model.addAttribute("one", dto);
            return "edit_form";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model){
        model.addAttribute("id", id);
        return "delete_form";
    }

    @PostMapping("/checkPass")
    public String checkPw(@RequestParam("id") int id,
                          @RequestParam("boardPass") String boardPass){
        String correctPw = service.selectPw(id);

        if(boardPass.equals(correctPw)){
            service.delete(id);
            return "redirect:/";
        }
        else {
            return "delete_form";
        }
    }
}
