package com.learningbaby.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("json_bangla")
    Call<List<User>> getUserData();
}
