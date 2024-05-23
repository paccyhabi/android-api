package com.example.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("posts/{id}")
    Call<Post> getPostById(@Path("id") int postId);
}

