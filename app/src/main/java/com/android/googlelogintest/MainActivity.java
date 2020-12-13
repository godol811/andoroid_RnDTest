package com.android.googlelogintest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//앱키자마자 구글 로그인이 움직이는 것이기 떄문에 추후에는 앱과 앱을 연결해서 사용 할 수 있도록 설정 해야할듯

public class MainActivity extends AppCompatActivity {

    private static final int RC_SIGN_IN = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGoogleSignIn = findViewById(R.id.btnSignIn);
        buttonGoogleSignIn.setOnClickListener(mOnclickListener);

    }
        View.OnClickListener mOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnSignIn:
                        Intent intent = new Intent(MainActivity.this,GoogleLoginActivity.class);
                        startActivity(intent);

                }
            }
        };

}






