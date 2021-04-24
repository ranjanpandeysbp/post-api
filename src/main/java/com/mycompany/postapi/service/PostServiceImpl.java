package com.mycompany.postapi.service;

import com.mycompany.postapi.api.client.PostFeignClient;
import com.mycompany.postapi.api.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostFeignClient postFeignClient;

    @Override
    public List<Post> getAllPosts() {
        return postFeignClient.getAllPosts();
    }

    @Override
    public Post getPostById(Long postId) {
        return postFeignClient.getPostById(postId);
    }

    @Override
    public List<Post> getAllPostsByUserId(Long userId) {
        return postFeignClient.getPostsByUserId(userId);
    }

    @Override
    public Post createPost(Post post) {
        return postFeignClient.createPost(post);
    }

    @Override
    public void updatePost(Long postId, Post post) {
        postFeignClient.updatePost(post);
    }

    @Override
    public void deletePost(Long postId) {
        postFeignClient.deletePost(postId);
    }
}
