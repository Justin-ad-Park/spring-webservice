package com.pulmuone.webservice.post.service;

import com.pulmuone.webservice.post.domain.posts.Posts;
import com.pulmuone.webservice.post.domain.posts.PostsRepository;
import com.pulmuone.webservice.post.dto.posts.PostsSaveRequestDto;
import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PostServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After("")
    public void cleanup () {
        postsRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_posts테이블에_저장된다 () {
        //given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .author("justin.ad.ppark@gmail.com")
                .content("테스트")
                .title("테스트 타이틀")
                .build();

        //when
        postsService.save(dto);

        //then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
    }
}