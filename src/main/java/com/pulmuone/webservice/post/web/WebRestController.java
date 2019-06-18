package com.pulmuone.webservice.post.web;

import com.pulmuone.webservice.post.dto.posts.PostsSaveRequestDto;
import com.pulmuone.webservice.post.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@AllArgsConstructor
public class WebRestController {

    /*
        스프링프레임워크에선 Bean 을 주입받는 방식들

        @Autowired
        setter
        생성자

        이중 가장 권장하는 방식이 생성자로 주입받는 방식입니다.
        (@Autowired는 비권장)
     */
    private PostsService postsService;
    private Environment env;



    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsService.save(dto);
    }

    // 현재 서비스 중인 프로파일 제공
    @GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}
