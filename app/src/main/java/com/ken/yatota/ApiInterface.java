package com.ken.yatota;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("upload_request.php")
    Call<InputmodelClass> uploadData(@Field("totalneckroll") String totalneckroll, @Field("barber1used") String barber1used,@Field("barber2used") String barber2used,@Field("barber3used") String barber3used);
}
