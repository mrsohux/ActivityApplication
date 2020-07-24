package sohel.shaikh.activityapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"this is on create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"this is on Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"this is on Resume");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"this is on stop");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"this is on pause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"this is on Restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"this is on Destroy");

    }
}