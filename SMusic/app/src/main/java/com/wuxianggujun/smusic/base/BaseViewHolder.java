package com.wuxianggujun.smusic.base;

import androidx.recyclerview.widget.RecyclerView;
import androidx.collection.SparseArrayCompat;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
  
public class BaseViewHolder extends RecyclerView.ViewHolder {

        private SparseArrayCompat<View> mViews;
        private View mConvertView;


        public BaseViewHolder(View itemView) {
            super(itemView);
            this.mConvertView = itemView;
            mViews = new SparseArrayCompat<View>();

        }

        /**
         * 获取视图
         *
         * @return
         */
        public View getItemView() {
            return itemView;
        }

        /**
         * 获取子控件
         *
         * @param id
         * @param <V>
         * @return
         */
        public <V extends View> V getView(int id) {
            View view = mViews.get(id);
            if (null == view) {
                view = itemView.findViewById(id);
                mViews.put(id, view);
            }
            return (V) view;
        }
        /**
         * 设置文本 - 字符串
         *
         * @param viewId
         * @param content
         * @return
         */
        public BaseViewHolder setText(int viewId, String content) {
            ((TextView) getView(viewId)).setText(content);
            return this;
        }

        /**
         * 设置文本 - 字符串
         *
         * @param viewId
         * @param visibility
         * @return
         */
        public BaseViewHolder setVisible(int viewId, int visibility) {
            getView(viewId).setVisibility(visibility);
            return this;
        }

        /**
         * 设置文本 - 资源
         *
         * @param viewId
         * @param resId
         * @return
         */
        public BaseViewHolder setText(int viewId, int resId) {
            ((TextView) getView(viewId)).setText(resId);
            return this;
        }

        /**
         * 设置文本颜色
         *
         * @param viewId
         * @param color
         * @return
         */
        public BaseViewHolder setTextColor(int viewId, int color) {
            ((TextView) getView(viewId)).setTextColor(color);
            return this;
        }

        /**
         * 设置文本颜色
         *
         * @param viewId
         * @param colorId
         * @return
         */
        public BaseViewHolder setTextColor(Context context, int viewId, int colorId) {
            ((TextView) getView(viewId)).setTextColor(context.getResources().getColor(colorId));
            return this;
        }

        /**
         * 设置可用性
         *
         * @param viewId
         * @param bEnable
         */
        public void setEnable(int viewId, boolean bEnable) {
            getView(viewId).setEnabled(bEnable);
        }

        /**
         * 设置控件背景
         *
         * @param viewId
         * @param drawable
         * @return
         */
        public BaseViewHolder setBackground(int viewId, Drawable drawable) {
            getView(viewId).setBackground(drawable);
            return this;
        }

        /**
         * 设置控件背景
         *
         * @param viewId
         * @param viewId
         * @param drawableId
         * @return
         */
        public BaseViewHolder setBackground(Context context, int viewId, int drawableId) {
            getView(viewId).setBackground(context.getResources().getDrawable(drawableId));
            return this;
        }


    }
    
   
