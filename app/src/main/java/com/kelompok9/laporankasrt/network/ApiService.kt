package com.kelompok9.laporankasrt.network

import com.kelompok9.laporankasrt.model.ResponseUser
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    //get list users with query
    @GET("data/YW840YyzhHyCvLGe/")
    fun getListUsers(@Query("page") page: String): Call<ResponseUser>

    //get list user by id using path
    @GET("data/YW840YyzhHyCvLGe/{id}")
    fun getUser(@Path("id") id: String): Call<ResponseUser>

    //post user using field x-www-form-urlencoded
    @FormUrlEncoded
    @POST("data/YW840YyzhHyCvLGe/")
    fun createUser(
        @Field("NamaDepan") NamaDepan: String,
        @Field("NamaBelakang") NamaBelakang: String
    ): Call<ResponseUser>

    //upload file using multipart
    @Multipart
    @PUT("api/uploadfile")
    fun updateUser(
        @Part("file") file: MultipartBody.Part,
        @PartMap data: Map<String, RequestBody>
    ): Call<ResponseUser>
}