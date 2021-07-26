package com.wuxianggujun.smusic.ui.mine.bean;

import com.wuxianggujun.smusic.base.BaseDataModel;
import java.util.List;
import java.util.ArrayList;
import com.wuxianggujun.smusic.R;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class MineTestBean extends BaseDataModel{
    
    private String title;
    private String content;
    private Integer imageRes;

    public MineTestBean(Integer imageRes,String title, String content) {
        this.title = title;
        this.content = content;
        this.imageRes = imageRes;
    }
      
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public Integer getImageRes() {
        return imageRes;
    }
    
    public static List<MineTestBean> getTestData(){
        List<MineTestBean> list = new ArrayList<MineTestBean>();
        list.add(new MineTestBean(R.mipmap.ic_launcher, "相信自己","哈哈😄"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "极致简约","哈哈哈(ಡωಡ)hiahiahia"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "努力样子","你奶奶家"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "梦幻小屋","在哪"));     
        list.add(new MineTestBean(R.mipmap.ic_launcher, "相信自己","集合"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "极致简约","呵呵呵"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "努力样子","呵呵啥"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "梦幻小屋","呵呵"));        
        list.add(new MineTestBean(R.mipmap.ic_launcher, "相信自己","谁死"));
        list.add(new MineTestBean(R.mipmap.ic_launcher, "极致简约","本森"));
        return list;

    }
    
    
    }
