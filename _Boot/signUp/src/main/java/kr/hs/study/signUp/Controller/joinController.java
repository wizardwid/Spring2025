package kr.hs.study.signUp.Controller;

import jakarta.servlet.http.HttpSession;
import kr.hs.study.signUp.DTO.joinDTO;
import kr.hs.study.signUp.Service.joinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class joinController {
    @Autowired
    private joinService service;

    @GetMapping("/signUp")
    public String joinForm() {
        return "join_form";
    }

    @GetMapping("/list")
    public String memberList(Model model) {
        List<joinDTO> list = service.findAll();
        model.addAttribute("data", list);
        return "member_list";
    }

    @PostMapping("/join")
    public String signUp(joinDTO dto) {
        service.save(dto);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "login_form";
    }

    @PostMapping("/member/login")
    public String login_done(joinDTO dto, HttpSession session){
        joinDTO re = service.login(dto);
        if(re!=null){
            session.setAttribute("loginName", re.getName());
            return "result";
        }
        else{
            return "lgoin_form";
        }
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model){
        joinDTO dto = service.selectOne(id);
        model.addAttribute("one", dto);
        return "edit_form";
    }

    @PostMapping("/update")
    public String info_update(joinDTO dto){
        joinDTO jd = service.update(dto);
        return "result";
    }
}
