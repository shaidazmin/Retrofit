package com.learningbaby.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private   static  final String BSE_URL = "http://shaoniiuc.com/";
    private static Retrofit retrofit = null;


    public static  Retrofit getRetrofit (){

        if (retrofit == null){
            retrofit  = new Retrofit.Builder()
                    .baseUrl(BSE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return  retrofit;
    }
}
