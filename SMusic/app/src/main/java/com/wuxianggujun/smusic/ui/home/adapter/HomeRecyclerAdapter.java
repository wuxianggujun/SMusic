package com.wuxianggujun.smusic.ui.home.adapter;

import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
import com.wuxianggujun.smusic.ui.home.bean.HomeBaseBean;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.wuxianggujun.smusic.R;
import com.wuxianggujun.smusic.ui.home.viewholder.BannerViewHolder;
import com.wuxianggujun.smusic.ui.home.bean.BannerBean;
import com.wuxianggujun.smusic.ui.home.viewholder.ItemOneViewHolder;
import com.wuxianggujun.smusic.ui.home.bean.DataBean;
import com.wuxianggujun.smusic.ui.home.viewholder.ItemTwoViewHolder;
import com.wuxianggujun.smusic.ui.home.bean.ItemTwoBean;
import androidx.recyclerview.widget.GridLayoutManager;
import com.wuxianggujun.smusic.ui.home.viewholder.ItemThreeViewHolder;
import com.wuxianggujun.smusic.ui.home.bean.ItemThreeBean;
import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public final static int TYPE_ITEM_BANNER = 6;

    public final static int TYPE_ITEM_ONE = 1;
    public final static int TYPE_ITEM_TWO = 2;
    public final static int TYPE_ITEM_THREE = 3;


    private List<HomeBaseBean> mlist;
    private Context context;
    private LayoutInflater inflater;

    private OnItemClickListener mListener;

    public HomeRecyclerAdapter(List<HomeBaseBean> mlist) {
        this.mlist = mlist;
    }

    public void setOnItemClickListener(OnItemClickListener mListener) {
        this.mListener = mListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (context == null)
            context = parent.getContext();
        if (inflater == null)
            inflater = LayoutInflater.from(context);
        View view;
        switch (viewType) {
            case TYPE_ITEM_BANNER:
                view = inflater.inflate(R.layout.item_banner_viewholder, parent, false);
                return new BannerViewHolder(view);
            case TYPE_ITEM_ONE:
                view = inflater.inflate(R.layout.item_one_viewholder, parent, false);
                return new ItemOneViewHolder(view);
            case TYPE_ITEM_TWO:
                view  = inflater.inflate(R.layout.item_two_viewholder, parent, false);
                return new ItemTwoViewHolder(view);
            case TYPE_ITEM_THREE:
                view = inflater.inflate(R.layout.item_three_viewholder, parent, false);
                return new ItemThreeViewHolder(view);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View p1) {
                    if (mListener != null) {
                        mListener.onClick(position);
                    }
                }
            });
        if (holder instanceof BannerViewHolder) {
            BannerBean bannerBean = (BannerBean) mlist.get(position);

        }
        if (holder instanceof ItemTwoViewHolder) {
            List<ItemTwoBean> twoBean = ItemTwoBean.getTestData();
            ItemTwoViewHolder itemTwoViewHolder = (ItemTwoViewHolder) holder;

            GridLayoutManager layoutManager = new GridLayoutManager(context, 2);
            layoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
            itemTwoViewHolder.recyclerView.setLayoutManager(layoutManager);       
            ItemTwoAdapter itemtwoAdapter = new ItemTwoAdapter(twoBean, context);
            itemTwoViewHolder.recyclerView.setAdapter(itemtwoAdapter);
        }
        if(holder instanceof ItemThreeViewHolder){
            List<ItemThreeBean> threeBean = ItemThreeBean.getTestData();
            ItemThreeViewHolder itemThreeViewHolder =  (ItemThreeViewHolder) holder;
            LinearLayoutManager layoutManager = new LinearLayoutManager(context);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            itemThreeViewHolder.recyclerview.setLayoutManager(layoutManager);       
            ItemThreeAdapter itemtwoAdapter = new ItemThreeAdapter(threeBean, context);
            itemThreeViewHolder.recyclerview.setAdapter(itemtwoAdapter);
                  
        }

    }

    @Override
    public int getItemCount() {
        return mlist == null ? 0 : mlist.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mlist.size() > 0) {
            return  mlist.get(position).getViewType();
        }
        return super.getItemViewType(position);
    }


    public interface OnItemClickListener {
        void onClick(int pos);
    }

}
