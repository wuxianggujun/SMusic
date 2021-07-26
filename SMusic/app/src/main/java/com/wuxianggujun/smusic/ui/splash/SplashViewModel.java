package com.wuxianggujun.smusic.ui.splash;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import android.os.CountDownTimer;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class SplashViewModel extends ViewModel{
    
   private MutableLiveData<String> content;
   private CountDownTimer countDownTimer;
   private long curTime;
   public SplashViewModel(){
       if(content == null){
           content= new MutableLiveData<String>();         
       }   
       countDownTimer = new CountDownTimer(4*1000, 1000){

           @Override
           public void onTick(long millisUntilFinished) {
               curTime = millisUntilFinished;
               content.setValue(millisUntilFinished / 1000 +"s");
           }

           @Override
           public void onFinish() {
               SplashUtils.getInstance().jump_main();
               cancel();
           }
       }.start();     
       
   }
   
    public void initCountDownTimer(long millisInFuture){
       countDownTimer = new CountDownTimer(millisInFuture, 1000) {
           @Override
           public void onTick(long millisUntilFinished) {
               curTime = millisUntilFinished;//当前剩余时间;
               //TimeTools.getCountTimeByLong(millisUntilFinished);
           }

           public void onFinish() {
               SplashUtils.getInstance().jump_main();
               cancel();
           }
       };
   }
   
   
   public LiveData<String> getContent(){
       if(content ==null){
           content = new MutableLiveData<String>();
           content.setValue("Hello world");
       }
       return content;
   }
 
   public void cancel(){
       if(countDownTimer!= null){
           countDownTimer.cancel();
           countDownTimer = null;
           
       }
   }
    
    
}
