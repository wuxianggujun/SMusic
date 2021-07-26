package com.wuxianggujun.smusic.ui.home.adapter;

import androidx.recyclerview.widget.RecyclerView;
import android.widget.Adapter;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.wuxianggujun.smusic.R;
import java.util.List;
import com.wuxianggujun.smusic.ui.home.bean.ItemThreeBean;
import android.view.LayoutInflater;
import android.content.Context;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class ItemThreeAdapter extends RecyclerView.Adapter<ItemThreeAdapter.ItemThreeViewHolder> {

    private List<ItemThreeBean> list;
    private Context context;

    public ItemThreeAdapter(List<ItemThreeBean> list, Context context) {
        this.list = list;
        this.context = context;
    }
    
    @Override
    public ItemThreeAdapter.ItemThreeViewHolder onCreateViewHolder(ViewGroup parent, int p2) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_three_view,parent,false);      
        return new ItemThreeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemThreeAdapter.ItemThreeViewHolder holder, int p2) {
        ItemThreeBean itemThreeBean = list.get(p2);
        holder.tv_title.setText(itemThreeBean.getTitle());
        holder.tv_content.setText(itemThreeBean.getContent());
        holder.iv_songImage.setImageResource(itemThreeBean.getImageRes());
        
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    
    
    class ItemThreeViewHolder  extends RecyclerView.ViewHolder{
      
        public TextView tv_title;
        public TextView tv_content;
        public ImageView iv_songImage;
             
        public ItemThreeViewHolder(View itemView){
            super(itemView);
            tv_title = itemView.findViewById(R.id.itemthreeviewTextView1);
            tv_content = itemView.findViewById(R.id.itemthreeviewTextView2);
            iv_songImage = itemView.findViewById(R.id.itemthreeviewImageView1);
        }
    }
    
}
