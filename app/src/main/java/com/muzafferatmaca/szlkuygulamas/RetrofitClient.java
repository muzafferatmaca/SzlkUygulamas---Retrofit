package com.muzafferatmaca.szlkuygulamas;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static  Retrofit retrofitClient = null;

    public static Retrofit getClient(String baseUrl){

        if (retrofitClient==null){
            retrofitClient = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return  retrofitClient;

    }

}
