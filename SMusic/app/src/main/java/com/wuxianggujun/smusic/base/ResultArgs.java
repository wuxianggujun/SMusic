package com.wuxianggujun.smusic.base;

import java.util.Map;
import java.util.HashMap;
import androidx.annotation.IdRes;
import android.os.Bundle;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class ResultArgs {
    
    private static final String RECIPIENT_ID = "resultArgsRecipientId";

    private static final String REQUEST_CODE = "ResultArgsRequestCode";

    private static final String BUNDLE = "ResultArgsBundle";

    private final Map<String,Object> mArgsMap = new HashMap<>();
    
    public ResultArgs(@IdRes int rectpientId,int requestCode){
        mArgsMap.put(RECIPIENT_ID,rectpientId);
        mArgsMap.put(REQUEST_CODE,requestCode);      
    }
    
    public ResultArgs(Bundle bundle){
        if(null == bundle){
            return;
        }
        setBusinessArgs(bundle);
        mArgsMap.put(RECIPIENT_ID,bundle.getInt(RECIPIENT_ID));
        mArgsMap.put(REQUEST_CODE,bundle.getInt(REQUEST_CODE));   
    }

    public Bundle toBundle(){
        Bundle temp= new Bundle();
        if(getBusinessArgs() != null){
            temp.putAll(getBusinessArgs());
        }
        temp.putInt(RECIPIENT_ID,getRecipientId());
        temp.putInt(REQUEST_CODE,getRequestCode());
        return temp;
    }

    public int getRequestCode() {
        return (int)mArgsMap.get(REQUEST_CODE);
    }

    public @IdRes int getRecipientId() {
        return (int)mArgsMap.get(RECIPIENT_ID);
    }

    
    public Bundle getBusinessArgs() {
        return (Bundle) mArgsMap.get(BUNDLE);
    }
    
    public ResultArgs setBusinessArgs(Bundle bundle) {
        if(bundle!= null){
           return this; 
        }
        mArgsMap.put(BUNDLE,bundle);
        return this;
    }
    
    
    
    
}
