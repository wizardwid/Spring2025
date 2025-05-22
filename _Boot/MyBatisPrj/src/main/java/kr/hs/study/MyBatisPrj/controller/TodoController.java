package kr.hs.study.MyBatisPrj.controller;

import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import kr.hs.study.MyBatisPrj.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
}
