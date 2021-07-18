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

        FragmentManager fragmentManager = getSupportFragmentManager();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();    
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav_view);
        NavigationUI.setupWithNavController(bottomNav, navController);
        //bottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

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


    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp();

    }






}
