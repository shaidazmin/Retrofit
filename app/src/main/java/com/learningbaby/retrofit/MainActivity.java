package com.learningbaby.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {

        try {

            ApiService service = ApiClient.getRetrofit().create(ApiService.class);
            Call<List<User>> call = service.getUserData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                  //  Log.d("onResponse", response.message());
                    List<User> userList = response.body();
                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(userList);
                    recyclerView.setAdapter(recyclerViewAdapter);

                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {

                }
            });

        }catch (Exception e){

        }
    }
}
