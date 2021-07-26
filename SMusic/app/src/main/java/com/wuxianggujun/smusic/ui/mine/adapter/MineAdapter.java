package com.wuxianggujun.smusic.ui.mine.adapter;

import com.wuxianggujun.smusic.base.BaseRecyclerAdapter;
import com.wuxianggujun.smusic.base.BaseViewHolder;
import android.content.Context;
import android.view.ViewGroup;
import com.wuxianggujun.smusic.base.BaseDataModel;
import android.view.View;
import android.view.LayoutInflater;
import com.wuxianggujun.smusic.R;
import java.util.List;
import com.wuxianggujun.smusic.ui.mine.bean.MineTestBean;
import android.widget.TextView;
import android.widget.ImageView;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class MineAdapter extends BaseRecyclerAdapter<MineTestBean> {

    List<MineTestBean> mDatas;

    public MineAdapter(Context context,List<MineTestBean> mDatas) {
        super(context,mDatas);
        this.mDatas = mDatas;
    }
    
    @Override
    protected BaseViewHolder getHolder(Context context, ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_three_view,parent,false);        
        return new MineViewHolder(view);
    }

    @Override
    protected void resizeHolder(Context context, BaseViewHolder baseHolder, int viewType) {
    }
    
    @Override
    protected void bindData(Context context, BaseViewHolder baseHolder, MineTestBean t, int postion, int itemViewType) {
          MineViewHolder mineViewHolder = (MineAdapter.MineViewHolder) baseHolder;
          
          mineViewHolder.tv_title.setText(t.getTitle());
          mineViewHolder.tv_context.setText(t.getContent());
          mineViewHolder.iv_image.setImageResource(t.getImageRes());
        
    }
    
    public class MineViewHolder extends BaseViewHolder{
        TextView tv_title;
        TextView tv_context;
        ImageView iv_image;
        
        public MineViewHolder(View itemView){
            super(itemView);
            iv_image = getView(R.id.itemthreeviewImageView1);
            tv_title = getView(R.id.itemthreeviewTextView1);
            tv_context = getView(R.id.itemthreeviewTextView2);
        }
        
        
        
    }
    
    
    
}
