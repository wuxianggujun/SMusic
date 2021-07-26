package com.wuxianggujun.smusic.ui.home.adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;
import com.wuxianggujun.smusic.ui.home.bean.ItemTwoBean;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import com.wuxianggujun.smusic.R;
import android.widget.TextView;
import android.widget.ImageView;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class ItemTwoAdapter extends RecyclerView.Adapter<ItemTwoAdapter.ItemTwoViewHolder> {

    
    private List<ItemTwoBean> list;
    private Context context;

    public ItemTwoAdapter(List<ItemTwoBean> list, Context context) {
        this.list = list;
        this.context = context;
    }
    
    @Override
    public ItemTwoAdapter.ItemTwoViewHolder onCreateViewHolder(ViewGroup p1, int p2) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_two_view,p1,false);      
        return new ItemTwoViewHolder(view);
    }
    
    
    
    @Override
    public void onBindViewHolder(ItemTwoAdapter.ItemTwoViewHolder holder, int position) {
        ItemTwoBean bean = list.get(position);
        holder.title_tv.setText(bean.getTitle());
        holder.image_iv.setImageResource(bean.getImageRes());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    
    
    class ItemTwoViewHolder extends RecyclerView.ViewHolder{
        public TextView title_tv;
        public ImageView image_iv;
        public ItemTwoViewHolder(View itemView){
            super(itemView);
            title_tv = itemView.findViewById(R.id.item_two_viewTextView);
            image_iv = itemView.findViewById(R.id.item_two_viewImageView);
        }
        
        
    }
    
}
