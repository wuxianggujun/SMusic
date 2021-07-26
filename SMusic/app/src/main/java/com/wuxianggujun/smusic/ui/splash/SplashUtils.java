package com.wuxianggujun.smusic.ui.splash;
import android.content.Context;
import android.content.Intent;
import com.wuxianggujun.smusic.ui.main.MainActivity;
import android.app.Activity;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class SplashUtils {
    
    private static volatile SplashUtils instance;//= new SplashUtils();
    private Activity context;
    
    private SplashUtils(){
        
    }
    
    public static synchronized SplashUtils getInstance(){
        if(instance==null){
            synchronized(SplashUtils.class){
                if(instance==null){
                    instance = new SplashUtils();
                }
            }
        }
        return instance;
    }
    
    
    public void setActivityContext(Activity context) {
        this.context= context;
    }
    
    
    public void jump_main(){    
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
        context.finish();
    }
    
    
    
}
