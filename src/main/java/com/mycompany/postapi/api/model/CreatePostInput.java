package com.mycompany.postapi.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CreatePostInput {

    Long userId;
    String title;
    String body;

    public CreatePostInput(Long userId, String title, String body){
        this.userId = userId;
        this.title = title;
        this.body = body;
    }
}
