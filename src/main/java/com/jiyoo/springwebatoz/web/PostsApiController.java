package com.jiyoo.springwebatoz.web;

import com.jiyoo.springwebatoz.service.posts.PostsService;
import com.jiyoo.springwebatoz.web.dto.PostsResponseDto;
import com.jiyoo.springwebatoz.web.dto.PostsSaveRequestDto;
import com.jiyoo.springwebatoz.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update (@PathVariable("id") Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable("id") Long id) {
        return postsService.findById(id);
    }
}
