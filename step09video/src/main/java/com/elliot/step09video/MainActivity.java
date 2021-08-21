package com.elliot.step09video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView; //비디오를 실행할 수 있게 도와주는 뷰
    private MediaController mediaController; // 재생이나 정지와 같은 미디어 제어 버튼 담당
    private String videoUrl = "https://ykarr.github.io/web/test.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);

        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse(videoUrl);

        videoView.setMediaController(mediaController); // 미디어 제어 버튼부 셋팅
        videoView.setVideoURI(uri); //비디오 뷰의 주소를 설정
        videoView.start(); // 비디오 실행
    }
}