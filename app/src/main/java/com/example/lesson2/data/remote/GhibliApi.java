package com.example.lesson2.data.remote;

import com.example.lesson2.data.models.Film;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GhibliApi {
    @GET("/films/{id}")
    Call<Film> getFilm(
            @Path("id") String id
    );
}
