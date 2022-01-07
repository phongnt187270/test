package vn.edu.hust.sis.phong.testretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface MyAPI {

    @GET("api/user")
    Call<User> getUser();
}
