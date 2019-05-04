package com.example.mrtus.demoapp.api;

import com.example.mrtus.demoapp.feature.createAccount.model.ResponseCreateAccount;
import com.example.mrtus.demoapp.feature.login.model.ResponseLogin;
import com.example.mrtus.demoapp.feature.search.model.ResponseDistrict;
import com.example.mrtus.demoapp.feature.search.model.ResponseSearch;
import com.example.mrtus.demoapp.feature.search.model.ResponseTime;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("/common/login")
    Call<ResponseLogin> login(@Field("phone") String phone,
                              @Field("password") String password);

    @FormUrlEncoded
    @POST("/common/create-account")
    Call<ResponseCreateAccount> createAccount(@Field("phone") String phone,
                                              @Field("name") String name,
                                              @Field("teamName") String teamName,
                                              @Field("password") String password);

    @FormUrlEncoded
    @GET("/common/get-pitch-free-time")
    Call<ResponseSearch> searchPitchFreeTime(@Query("district") String district,
                                             @Query("date") String date,
                                             @Query("time") Long idTime,
                                             @Query("type") String type);

    @FormUrlEncoded
    @GET("/common/get-all-time")
    Call<ResponseTime> getAllTime();

    @FormUrlEncoded
    @GET("/common/get-all-district")
    Call<ResponseDistrict> getAllDistrict();
}
