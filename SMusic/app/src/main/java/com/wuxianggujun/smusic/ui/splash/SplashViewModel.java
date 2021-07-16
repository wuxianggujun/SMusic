package com.wuxianggujun.smusic.ui.splash;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class SplashViewModel extends ViewModel{
    
   private MutableLiveData<String> content;
   
   public LiveData<String> getContent(){
       if(content ==null){
           content = new MutableLiveData<String>();
           content.setValue("Hello world");
       }
       return content;
   }
 
   
    
    
}
