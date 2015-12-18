package me.silfen.deansilfen.qswipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;

import java.util.List;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://jservice.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    ClueInterface service = retrofit.create(ClueInterface.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<Clue> clues = (List<Clue>) service.getClues(1);
        Log.d(TAG, clues.get(0).toString());
        setContentView(R.layout.activity_main);
    }
}
