package vn.edu.hust.sis.phong.testretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public TextView textviewName;
    public TextView textviewPhonnumber;
    public TextView textviewRole;

    User user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewName = findViewById(R.id.name);
        textviewPhonnumber = findViewById(R.id.phonenumber);
        textviewRole = findViewById(R.id.role);


        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost/laravel_api/public/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API_test retrofitAPI = retrofit.create(API_test.class);

        Call<User> call = retrofitAPI.getUser();

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                user1 = response.body();
                textviewName.setText(user1.getName());
                textviewPhonnumber.setText(user1.getPhonenumber());
                textviewRole.setText(user1.getRole());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}