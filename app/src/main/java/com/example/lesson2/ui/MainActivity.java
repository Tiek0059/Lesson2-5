package com.example.lesson2.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.lesson2.R;
import com.example.lesson2.data.models.Film;
import com.example.lesson2.data.remote.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitBuilder.getInstance().getFilm("").enqueue(new Callback<Film>() {
            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {
                if (response.isSuccessful() && response.body() != null){
                    Log.d("TAG", response.body().toString());
                }else{
                    Log.d("TAG", "Error");
                }
            }

            @Override
            public void onFailure(Call<Film> call, Throwable t) {
                Log.d("TAG", t.getLocalizedMessage());
            }
        });
    }
}