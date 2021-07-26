package com.wuxianggujun.smusic.base;


import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.collection.SparseArrayCompat;
import android.view.ViewGroup;
import java.util.List;
import java.lang.ref.WeakReference;
import android.content.Context;
import android.widget.TextView;
import android.graphics.drawable.Drawable;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public abstract class BaseRecyclerAdapter<T extends BaseDataModel> extends RecyclerView.Adapter<BaseViewHolder> {

    private WeakReference<Context> contextWeakReference = null;
    private OnItemClickListener<T> onItemClickListener;
    private List<T> mDatas;


    protected abstract BaseViewHolder getHolder(Context context, ViewGroup parent, int viewType);

    protected abstract void resizeHolder(Context context, BaseViewHolder baseHolder, int viewType);

    // 子类实现对不同的item进行操作
    protected abstract void bindData(Context context,BaseViewHolder baseHolder, T t, int postion, int itemViewType);


    public BaseRecyclerAdapter(Context context, List<T> mDatas) {     
        this.contextWeakReference = new WeakReference<>(context);     
        this.mDatas = mDatas;
    }

   
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder vh = getHolder(contextWeakReference.get(), parent, viewType);
        resizeHolder(contextWeakReference.get(), vh, viewType);     
        return vh;
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int postion) {
        bindData(contextWeakReference.get(), holder, mDatas.get(postion), postion, getItemViewType(postion));   
    }


    /**
     * 设置监听接口
     * @param onItemClickListener
     */
    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    /**
     * 创建一个监听事件的接口
     */
    public interface OnItemClickListener<T> {
        void onClick(View v, int position, T t, int itemViewType, Object externParams);
    }

    /**
     * 给控件添加点击事件
     * @param v
     * @param position
     * @param t
     * @param itemViewType
     */
    public void addOnItemClickListener(View v, final int position, final T t, final int itemViewType, final Object externParams) {
        if (null != v) {
            v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (null != onItemClickListener) {
                            onItemClickListener.onClick(v, position, t, itemViewType, externParams);
                        }
                    }
                });
        }
    }

    
    /*
     * 直接回调点击事件
     * @param v
     * @param position
     * @param t
     * @param itemViewType
     */
    public void dispatchOnItemClickListener(View v, int position, T t, int itemViewType, Object externParams) {
        if (null != onItemClickListener) {
            onItemClickListener.onClick(v, position, t, itemViewType, externParams);
        }
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0: mDatas.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mDatas.size() > 0) {
            return  mDatas.get(position).getViewType();
        }
        return super.getItemViewType(position);
    }



    


    



}
