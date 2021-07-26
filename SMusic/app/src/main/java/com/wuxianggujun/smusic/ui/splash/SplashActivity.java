package com.wuxianggujun.smusic.ui.splash;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.wuxianggujun.smusic.R;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import com.wuxianggujun.smusic.ui.main.MainActivity;
import android.os.Build;
import android.view.View;
import android.annotation.SuppressLint;
import java.lang.reflect.Field;
import android.view.WindowManager;
import android.graphics.Color;
import android.view.Window;
import android.widget.TextView;
/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class SplashActivity extends AppCompatActivity {

    private SplashViewModel splashViewModel;
    private TextView countDownTimer_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = this.getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE);      
        //window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        window.setStatusBarColor(Color.parseColor("#9A0000"));  
        setContentView(R.layout.activity_splash);
        //splashViewModel = new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(SplashViewModel.class);
        countDownTimer_tv = findViewById(R.id.tv_jump);      
        SplashUtils.getInstance().setActivityContext(SplashActivity.this);
        
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        splashViewModel.getContent().observe(this, new Observer<String>(){

                @Override
                public void onChanged(String p1) {
                  countDownTimer_tv.setText(p1);  
                }
            });
            
       /*  final Timer timer = new Timer();

        timer.schedule(new TimerTask(){

                @Override
                public void run() {
                    
                }
            }, 3000);
            
      */
      
    }

    
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashViewModel.cancel();
    }
    
    
    
    
    
}
