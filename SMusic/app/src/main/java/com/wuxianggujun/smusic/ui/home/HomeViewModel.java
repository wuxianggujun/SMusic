package com.wuxianggujun.smusic.ui.home;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class HomeViewModel extends ViewModel{
    
    private MutableLiveData<String> mText;
    
    public HomeViewModel(){
        if(mText == null){
            mText = new MutableLiveData<String>();
            mText.setValue("");
        }
    }
    
    
    public LiveData<String> getText(){
        return mText;
    }
    
}
