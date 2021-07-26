package com.wuxianggujun.smusic.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.wuxianggujun.smusic.R;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.fragment.app.FragmentManager;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import android.widget.Toast;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class MainActivity extends AppCompatActivity {

    
    private AppBarConfiguration mAppBarConfiguration;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        Drawable moreIcon = ContextCompat.getDrawable(toolbar.getContext(),R.mipmap.sidemenu_settings);
        toolbar.setOverflowIcon(moreIcon);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_view);
        
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_home,R.id.navigation_mine).build();
        
        
        FragmentManager fragmentManager = getSupportFragmentManager();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();    
        NavigationUI.setupActionBarWithNavController(this,navController,mAppBarConfiguration);
        NavigationUI.setupWithNavController(bottomNav, navController);
        
        
        //bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
            || super.onSupportNavigateUp();
    }

    
    
    
    
/*
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.homeFragment:
                    Toast.makeText(getApplication(), "我是主页按钮", Toast.LENGTH_SHORT).show();
                    return true;


            }    

            return false;
        }
    };

*/







}
