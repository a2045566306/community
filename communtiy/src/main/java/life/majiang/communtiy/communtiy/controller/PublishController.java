package life.majiang.communtiy.communtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PublishController {

    @GetMapping("/publish")
    public String publishController() {
        return "publish";
    }
}
