package com.mycompany.postapi.api.model;

import lombok.Value;

@Value
public class Post extends CreatePostInput {

    Long id;

    Post(Long id, Long userId, String title, String body) {
        super(userId, title, body);
        this.id = id;
    }

}
