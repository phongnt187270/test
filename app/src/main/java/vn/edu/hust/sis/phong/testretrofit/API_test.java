package vn.edu.hust.sis.phong.testretrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface API_test {

    @GET("myuser")
    Call<User> getUser();
}
