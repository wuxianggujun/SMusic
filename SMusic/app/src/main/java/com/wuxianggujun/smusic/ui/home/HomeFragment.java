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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import com.wuxianggujun.smusic.ui.home.bean.HomeBaseBean;
import java.util.ArrayList;
import com.wuxianggujun.smusic.ui.home.bean.BannerBean;
import com.wuxianggujun.smusic.ui.home.adapter.HomeRecyclerAdapter;
import android.widget.Toast;
import com.wuxianggujun.smusic.ui.home.bean.ItemTwoBean;
import com.wuxianggujun.smusic.ui.home.bean.ItemThreeBean;
/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class HomeFragment extends BaseFragment {

    private RecyclerView home_RecyclerView;
    private List<HomeBaseBean> mlist=new ArrayList<HomeBaseBean>();

    @Override
    protected void onBindListener() {

    }

    @Override
    public void initView(View rootView) {
        home_RecyclerView = rootView.findViewById(R.id.recyclerview);      
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        home_RecyclerView.setLayoutManager(linearLayoutManager);
        BannerBean bean=new BannerBean();
        bean.setTitle("无相孤君");
        mlist.add(bean);
        bean.setViewType(HomeRecyclerAdapter.TYPE_ITEM_BANNER);
        
        HomeBaseBean home =new  HomeBaseBean();
        home.setViewType(HomeRecyclerAdapter.TYPE_ITEM_ONE);
        mlist.add(home);
        ItemTwoBean twobean = new ItemTwoBean();
        twobean.setViewType(HomeRecyclerAdapter.TYPE_ITEM_TWO);
        mlist.add(twobean);
        ItemThreeBean threeBean = new ItemThreeBean();
        twobean.setViewType(HomeRecyclerAdapter.TYPE_ITEM_THREE);
        mlist.add(threeBean);
        
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(mlist);
        home_RecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        adapter.setOnItemClickListener(new HomeRecyclerAdapter.OnItemClickListener(){

                @Override
                public void onClick(int pos) {
                    Toast.makeText(getActivity(), "点击了"+pos, Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public int getLayoutResId() {  
        return R.layout.fragment_home;
    }




}
