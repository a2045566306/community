package life.majiang.communtiy.communtiy.controller;

import life.majiang.communtiy.communtiy.dto.PaginationDTO;
import life.majiang.communtiy.communtiy.dto.QuestionDTO;
import life.majiang.communtiy.communtiy.mapper.QuestionMapper;
import life.majiang.communtiy.communtiy.mapper.UserMapper;
import life.majiang.communtiy.communtiy.model.Question;
import life.majiang.communtiy.communtiy.model.User;
import life.majiang.communtiy.communtiy.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5") Integer size) {

        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
