package com.matutino.louis;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf","onCreate success");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf","onStart success");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf","onResume success");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause success");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop success");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","onDestroy success");
    }
    public void  display(View v){
        Toast.makeText(this, "this is toast", Toast.LENGTH_LONG).show();
    }

    public void display2(View V){
        Snackbar.make(V,"Snackbar is me",Snackbar.LENGTH_LONG);
    }


}
