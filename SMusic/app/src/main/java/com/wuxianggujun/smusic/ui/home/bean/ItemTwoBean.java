package com.wuxianggujun.smusic.ui.home.bean;
import java.util.List;
import java.util.ArrayList;
import com.wuxianggujun.smusic.R;

/**
 * @作者: 无相孤君
 * @QQ: 3344207732
 * @描述:    
 */
public class ItemTwoBean  extends HomeBaseBean{
    
    private Integer imageRes;
    private String title;

    public ItemTwoBean(){
        
    }
    
    public ItemTwoBean(Integer imageRes, String title) {
        this.imageRes = imageRes;
        this.title = title;
    }
    


    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public Integer getImageRes() {
        return imageRes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public static List<ItemTwoBean> getTestData(){
        List<ItemTwoBean> list = new ArrayList<ItemTwoBean>();
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));     
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));        
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));        
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));        
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));        
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "相信自己"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "极致简约"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "努力样子"));
        list.add(new ItemTwoBean(R.mipmap.ic_launcher, "梦幻小屋"));        
        
        
        
        return list;
        
    }
    
    
    }
