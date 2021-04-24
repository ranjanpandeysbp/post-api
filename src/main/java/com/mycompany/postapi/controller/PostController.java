package com.mycompany.postapi.controller;

import com.mycompany.postapi.api.model.Post;
import com.mycompany.postapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/posts")
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() { return postService.getAllPosts(); }

    @GetMapping("/{postId}")
    public Post getPostById(@PathVariable Long postId) { return postService.getPostById(postId); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PutMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePost(@PathVariable Long postId, Post post) { postService.updatePost(postId, post); }

    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePost(@PathVariable Long postId) { postService.deletePost(postId); }
}
