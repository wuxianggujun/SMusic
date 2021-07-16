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
/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class SplashActivity extends AppCompatActivity {

    private SplashViewModel splashViewModel;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //splashViewModel = new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(SplashViewModel.class);
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        splashViewModel.getContent().observe(this, new Observer<String>(){

                @Override
                public void onChanged(String p1) {
                    
                }
            });
            
        final Timer timer = new Timer();

        timer.schedule(new TimerTask(){

                @Override
                public void run() {
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);
                    timer.cancel();
                    finish();
                }
            }, 3000);
            
      
    }
    
    
    
    
}
