package vn.edu.hust.sis.phong.testretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity<RetrofitAPI> extends AppCompatActivity {

    private static final String TAG = "API error";
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2/laravel_api/public/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyAPI myAPI = retrofit.create(MyAPI.class);

        Call<User>  call = myAPI.getUser();

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() != 200){
                    txt.setText("Connection failed");
                    return;
                }

                String json_str;

                json_str = response.body().getIdUser() + " "
                        + response.body().getName();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                txt.setText("onFailure");
                Log.e(TAG, t.getMessage());
            }
        });

    }
}