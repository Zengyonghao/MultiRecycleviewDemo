package com.example.administrator.multirecycleviewdemo.adapter;

import com.chad.library.adapter.base.BaseViewHolder;
import com.chaychan.adapter.BaseItemProvider;
import com.chaychan.adapter.ItemProviderTag;
import com.example.administrator.multirecycleviewdemo.R;
import com.example.administrator.multirecycleviewdemo.bean.BannerBean;

/**
 * Created by yong hao zeng on 2018/5/4.
 */
@ItemProviderTag(
        viewType = 0,
        layout = R.layout.item_banner
)
public class BannerAdapter extends BaseItemProvider<BannerBean> {

    @Override
    public void convert(BaseViewHolder baseViewHolder, BannerBean bannerBean, int i) {

    }

    @Override
    public void onClick(BaseViewHolder baseViewHolder, BannerBean bannerBean, int i) {

    }

    @Override
    public boolean onLongClick(BaseViewHolder baseViewHolder, BannerBean bannerBean, int i) {
        return false;
    }
}
