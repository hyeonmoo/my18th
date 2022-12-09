package study.project.my18th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import study.project.my18th.vo.UserVo;

@Controller
public class Home {
    
    @RequestMapping(value="/my18th", method= RequestMethod.GET)
    public String home(Model model){
        UserVo userVo = new UserVo();
        userVo.setId("hyeonm00");
        userVo.setName("강현무");
        model.addAttribute("user",userVo);
        return "index";
    }
}
