package com.wuxianggujun.smusic.ui.home;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.wuxianggujun.smusic.R;
import com.wuxianggujun.smusic.base.BaseFragment;
import android.widget.Button;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class HomeFragment extends BaseFragment {

    @Override
    protected void onBindListener() {
        
    }
    
    
    Button btn;
    @Override
    public void initView(View rootView) {
        btn=rootView.findViewById(R.id.fragmenthomeButton1);
        btn.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    NavController navController = Navigation.findNavController(view);
                    navController.navigate(R.id.nav_mine);

                }
            });
    }

    @Override
    public int getLayoutResId() {  
        return R.layout.fragment_home;
    }
    
    
    
    
}
