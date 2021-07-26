package com.wuxianggujun.smusic.ui.mine;

import com.wuxianggujun.smusic.base.BaseFragment;
import android.view.View;
import com.wuxianggujun.smusic.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.wuxianggujun.smusic.ui.mine.adapter.MineAdapter;
import com.wuxianggujun.smusic.base.BaseRecyclerAdapter;
import java.util.List;
import java.util.ArrayList;
import com.wuxianggujun.smusic.ui.mine.bean.MineTestBean;
import com.wuxianggujun.smusic.base.BaseViewHolder;
import android.content.Context;
import android.view.ViewGroup;
/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class MineFragment extends BaseFragment {
   
    private RecyclerView recyclerView;
    private MineAdapter mineAdapter;
    
    @Override
    protected void onBindListener() {
    }


    
    @Override
    public void initView(View rootView) {
        recyclerView = rootView.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        mineAdapter = new MineAdapter(getContext(),MineTestBean.getTestData());
        mineAdapter.notifyDataSetChanged();
        recyclerView.setAdapter(mineAdapter);
     
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_mine;
    }
    
    
    
    
}
