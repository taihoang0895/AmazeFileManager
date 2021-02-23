package com.amaze.filemanager.my;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.amaze.filemanager.R;

import java.io.File;

public class MyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        File file = new File("/storage/emulated/0/Download/DownloadSocialVideo/facebook/3/small.mp4");
        Log.d("taihh", "onCreate: " + file.canWrite());


    }
}
