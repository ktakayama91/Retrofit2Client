package com.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Kei Takayama
 * Created on 12/1/16.
 */
public interface Client {

    @GET("/greeting")
    Call<GreetingsImpl> getGreeting();
}
