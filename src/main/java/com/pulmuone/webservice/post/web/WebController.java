package com.pulmuone.webservice.post.web;

import com.pulmuone.webservice.post.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")    // == @RequestMapping(value="/", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("now", new java.util.Date());
        model.addAttribute("posts", postsService.findAllDesc());
        return "index";
    }

//    @GetMapping("/index")    // == @RequestMapping(value="/", method = RequestMethod.GET)
//    public String bootstapSample(Model model) {
//        return "index";
//    }


}