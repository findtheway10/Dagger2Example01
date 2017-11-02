package com.daekyung.dagger2example01;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.daekyung.dagger2example01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //create
        MediaComponent component = DaggerMediaComponent.create();
        MediaController controller = component.mediaController();
        String currentTime = controller.getCurrentPlayTime();

        //build
        component = DaggerMediaComponent.builder()
                .mediaModule(new MediaModule())
                .build();

        controller = component.mediaController();
        currentTime = controller.getCurrentPlayTime();

        Log.d("dagger", currentTime);
        activityMainBinding.textView.setText(currentTime);
    }
}
