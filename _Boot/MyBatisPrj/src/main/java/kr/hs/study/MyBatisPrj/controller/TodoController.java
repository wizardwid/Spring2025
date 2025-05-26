package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.DAO.TodoDAO;
import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import kr.hs.study.MyBatisPrj.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/Todo")
    public String todo(Model model){
        List<todoDTO> all = service.listAll();
        model.addAttribute("data", all);
        System.out.println("size : " + all.size());
        return "todo_input";
    }

    @PostMapping("/todo2")
    public String todo2(todoDTO dto) {
        service.insert(dto);
        return "redirect:/Todo";
    }

    @GetMapping("/tEdit/{idx}")
    public String edit_form(@PathVariable("idx") int idx, Model model){
        System.out.println("idx : " + idx);
        todoDTO dto = service.selectOne(idx);
        model.addAttribute("one", dto);
        return "todo_edit";
    }

    @PostMapping("/update")
    public String edit(todoDTO dto, Model model) {
        if (dto.getPassword().equals(service.selectPw(dto.getIdx()))) {
            service.update(dto);
            if ("Y".equalsIgnoreCase(dto.getStatus())) {
                service.delete(dto.getIdx());
            }
            return "redirect:/Todo";
        } else {
            model.addAttribute("error", "비밀번호가 틀렸습니다.");
            model.addAttribute("one", dto);
            return "todo_edit";
        }
    }

    @GetMapping("/tDelete/{idx}")
    public String deleteForm(@PathVariable("idx") int idx, Model model) {
        model.addAttribute("idx", idx);
        return "check_pw";
    }

    @PostMapping("/tDelete")
    public String checkPw(@RequestParam("idx") int idx,
                          @RequestParam("password") String password,
                          Model model) {

        String correctPw = service.selectPw(idx);

        if (password.equals(correctPw)) {
            service.delete(idx);
            return "redirect:/Todo";
        } else {
            model.addAttribute("idx", idx);
            model.addAttribute("error", "비밀번호가 틀렸습니다.");
            return "check_pw";
        }
    }
}
