package com.wuxianggujun.smusic.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.wuxianggujun.smusic.R;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);
        
    }
    
    
    
}
