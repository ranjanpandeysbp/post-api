package com.mycompany.postapi.api.client;

import com.mycompany.postapi.api.config.FeignClientConfig;
import com.mycompany.postapi.api.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "postFeignClient",  configuration = FeignClientConfig.class, url = "https://jsonplaceholder.typicode.com")
public interface PostFeignClient {

    @GetMapping("/posts")
    List<Post> getAllPosts();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable Long postId);

    @GetMapping("/posts")
    List<Post> getPostsByUserId(@RequestParam Long userId);

    @PostMapping("/posts")
    Post createPost(@RequestBody Post post);

    @PutMapping("/posts")
    Post updatePost(Post post);

    @DeleteMapping("/posts/{postId}")
    Post deletePost(@PathVariable Long postId);
}
