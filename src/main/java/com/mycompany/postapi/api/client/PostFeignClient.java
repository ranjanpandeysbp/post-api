package com.mycompany.postapi.api.client;

import com.mycompany.postapi.api.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "postFeignClient", url = "https://jsonplaceholder.typicode.com")
public interface PostFeignClient {

    @GetMapping("/posts")
    List<Post> getAllPosts();

    @GetMapping("/posts/{postId}")
    Post getPostById(@PathVariable Long postId);


}
