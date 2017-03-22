package com.shohoz.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Droid on 22-Mar-17.
 */

public class RetroFitApiClient {

    public static final String BASE_URL = "http://api.androidhive.info/json/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory
                            .create()).build();
        }
        return retrofit;
    }
}
