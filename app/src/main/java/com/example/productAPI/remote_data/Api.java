package com.example.productAPI.remote_data;

import com.example.productAPI.models.ModelM;
import com.example.productAPI.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface Api {
    @GET("api/v1/product/all")
    Call<List<ModelM>> getStoreProducts();

//    @GET("products")
//    Call<List<ModelM>> getStoreProducts();

    @POST("api/v1/product/create/")
    Call<ModelM> createNewProducts();

    @GET("api/v1/product/create/")
    Call<ModelM> getProductsById();

    @PUT("api/v1/product/{id}/")
    Call<ModelM> updateProductById();

    @DELETE("api/v1/product/{id}/")
    Call<ModelM> deleteProductById();

    @PATCH("api/v1/product/{id}/")
    Call<ModelM> changeProductById();

    @POST("api/v1/auth/register")
    Call<User> registrationNewUser(@Body User user);

   @POST("api/v1/auth/login")
   Call<User> createLoginUser(@Body User user);

   @POST("api/v1/auth/logout/")
   Call<User> makeLogOutUser();

}
